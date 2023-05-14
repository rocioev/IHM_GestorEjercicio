package com.example.ihm_gestorejercicio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RutinaDiaDetalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_dia_detalle);
        setToolBar();

        ImageView flechaInicioEntreno = findViewById(R.id.flechaInicioEntreno);
        flechaInicioEntreno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RutinaDiaDetalle.this, RutinaEjercicioDetalle.class);
                startActivity(intent);
            }
        });

        ImageView ejerciciosEntrenoBanca = findViewById(R.id.ejerciciosEntrenoBanca);
        ejerciciosEntrenoBanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RutinaDiaDetalle.this, RutinaEjercicioDetalle.class);
                startActivity(intent);
            }
        });

        ImageView editar = findViewById(R.id.iconoeditar);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RutinaDiaDetalle.this, RutinaDiaEditar.class);
                startActivity(intent);
            }
        });
    }

    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.nom_dia_rutina);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RutinaDiaDetalle.this, RutinasDetalle.class);
                startActivity(intent);
            }
        });
    }



}