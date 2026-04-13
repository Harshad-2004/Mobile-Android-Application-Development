package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;


import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText etName, etPhone, etAddress;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etAddress = findViewById(R.id.etAddress);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {

            String name = etName.getText().toString();
            String phone = etPhone.getText().toString();
            String address = etAddress.getText().toString();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            intent.putExtra("name", name);
            intent.putExtra("phone", phone);
            intent.putExtra("address", address);

            startActivity(intent);
        });
    }
}