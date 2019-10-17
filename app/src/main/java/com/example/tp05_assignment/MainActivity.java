package com.example.tp05_assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();


        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switchFrags();
            }
        });
    }

    public void switchFrags() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        try {
            CFragment frag_c = new CFragment();

            ft.remove(fm.findFragmentById(R.id.frag_b));
            ft.add(R.id.frags_container, frag_c);
            ft.commit();
        }
        catch(Exception e) {
            //Already switched from Frag B to Frag C, so do nothing
        }
    }

}
