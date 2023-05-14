package com.example.ihm_gestorejercicio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Configuracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        setToolBar();

        Button notificas = findViewById(R.id.notif);
        Button idiom = findViewById(R.id.idiom);
        Button perfilo = findViewById(R.id.perfilB);
        Button Accesiblo = findViewById(R.id.access);
        Button paguitas = findViewById(R.id.datosp);
        Button datosinicio = findViewById(R.id.datosinic);
        Button sistmetros = findViewById(R.id.smetric);


        notificas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Configuracion.this, Notificaciones.class);
                startActivity(intent);
            }

        });

        idiom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Configuracion.this, Idioma.class);
                startActivity(intent);
            }
        });

        perfilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Configuracion.this, Perfil.class);
                startActivity(intent);
            }
        });

        Accesiblo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Configuracion.this, Error.class);
                startActivity(intent);
            }
        });

        paguitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Configuracion.this, Error.class);
                startActivity(intent);
            }
        });

        datosinicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Configuracion.this, DatosISesion.class);
                startActivity(intent);
            }
        });
        sistmetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Configuracion.this, SisMetrico.class);
                startActivity(intent);
            }
        });
    }

    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.config);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Configuracion.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}