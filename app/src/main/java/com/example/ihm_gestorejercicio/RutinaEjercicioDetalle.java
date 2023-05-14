package com.example.ihm_gestorejercicio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class RutinaEjercicioDetalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_ejercicio_detalle);

        setToolBar();

        ImageView registrar = findViewById(R.id.botonregistrar);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RutinaEjercicioDetalle.this, "Se han guardado los datos registrados", Toast.LENGTH_LONG).show();
            }
        });

    }

    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Rutinas");
        toolbar.setNavigationIcon(R.drawable.flechahaciaatras);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RutinaEjercicioDetalle.this, RutinaDiaDetalle.class);
                startActivity(intent);
            }
        });
    }
}