package com.example.lab_ise;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LabDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String lab = getIntent().getStringExtra("lab");

        if (lab == null) {
            // Handle null case, maybe finish or show default
            finish();
            return;
        }

        if(lab.equals("java_lab"))
            setContentView(R.layout.lab1);

        else if(lab.equals("rprogram"))
            setContentView(R.layout.lab2);

        else if(lab.equals("webtech"))
            setContentView(R.layout.lab3);

        else if(lab.equals("system_program"))
            setContentView(R.layout.lab4);

        else if(lab.equals("a_database"))
            setContentView(R.layout.lab5);

        else if(lab.equals("project"))
            setContentView(R.layout.lab6);

        else if(lab.equals("python"))
            setContentView(R.layout.lab7);

        else if(lab.equals("mad"))
            setContentView(R.layout.lab8);

        else if(lab.equals("database_eng"))
            setContentView(R.layout.lab9);

        else if(lab.equals("research"))
            setContentView(R.layout.lab10);

        else if(lab.equals("c"))
            setContentView(R.layout.lab11);

        else if(lab.equals("cpp"))
            setContentView(R.layout.lab12);
        else {
            finish();
        }
    }

    public void goBack(View view) {
        finish();
    }
}