package com.example.ihm_gestorejercicio;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class RegistroDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrodatosvacio);

        ImageView flechaAtras = findViewById(R.id.flechaatras);
        flechaAtras.setOnClickListener(v -> {
            Intent intent = new Intent(RegistroDatos.this, CrearCuentaActivity.class);
            startActivity(intent);
        });

        ImageView botonSiguiente = findViewById(R.id.botonSiguiente);
        botonSiguiente.setOnClickListener(v -> {
            Intent intent = new Intent(RegistroDatos.this, Perfil_editar_foto.class);
            startActivity(intent);
        });
    }

}