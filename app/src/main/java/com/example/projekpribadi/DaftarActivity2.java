package com.example.projekpribadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DaftarActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar2);
    }

    public void Login(View view) {
        Intent intent= new Intent(DaftarActivity2.this,Homeactivity.class);
        startActivity(intent);
    }
}