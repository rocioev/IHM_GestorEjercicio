package com.example.ihm_gestorejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CrearCuentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }

    public void pasoHome (View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }
}