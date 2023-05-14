package com.example.ihm_gestorejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Perfil_editar_foto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_editar_foto);


        ImageView botonSiguiente = findViewById(R.id.siguiente);
        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil_editar_foto.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        ImageView flechaatras = findViewById(R.id.flechaAtras2);
        flechaatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil_editar_foto.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }


}