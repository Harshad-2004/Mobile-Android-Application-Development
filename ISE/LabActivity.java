package com.example.lab_ise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab);
    }

    public void openLab(View view) {

        Intent i = new Intent(this, LabDetailActivity.class);

        int id = view.getId();
        if (id == R.id.java_lab) {
            i.putExtra("lab","java_lab");
        } else if (id == R.id.rprogram) {
            i.putExtra("lab","rprogram");
        } else if (id == R.id.webtech) {
            i.putExtra("lab","webtech");
        } else if (id == R.id.system_program) {
            i.putExtra("lab","system_program");
        } else if (id == R.id.a_database) {
            i.putExtra("lab","a_database");
        } else if (id == R.id.project) {
            i.putExtra("lab","project");
        } else if (id == R.id.python) {
            i.putExtra("lab","python");
        } else if (id == R.id.mad) {
            i.putExtra("lab","mad");
        } else if (id == R.id.database_eng) {
            i.putExtra("lab","database_eng");
        } else if (id == R.id.research) {
            i.putExtra("lab","research");
        } else if (id == R.id.c) {
            i.putExtra("lab","c");
        } else if (id == R.id.cpp) {
            i.putExtra("lab","cpp");
        }

        startActivity(i);
    }
}