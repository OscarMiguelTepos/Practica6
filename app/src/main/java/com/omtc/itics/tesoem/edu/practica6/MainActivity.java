package com.omtc.itics.tesoem.edu.practica6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Mensaje(View v){
        Toast.makeText(this, "BIENVENIDO TANAKA", Toast.LENGTH_SHORT).show();

    }
}
