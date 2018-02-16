package com.example.lenovo.fragment;

import android.app.FragmentTransaction;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void changeFragement(View view){

        if(view == findViewById(R.id.button)){
            frgaementOne frag;
            frag = new frgaementOne();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragement , frag);
            ft.commit();
        }
        if(view == findViewById(R.id.button2)){
            fragementTwo frag;
            frag = new fragementTwo();
            android.app.FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragement , frag);
            ft.commit();
        }
    }
}
