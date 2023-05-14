package com.example.ihm_gestorejercicio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class RutinaDiaEditar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_dia_editar);
        setToolBar();

        ImageView masrutina = findViewById(R.id.masrutina);
        masrutina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RutinaDiaEditar.this, RutinaEjercicioDetalle.class);
                startActivity(intent);
            }
        });
    }

    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.nom_dia_rutina);
        getSupportActionBar().setSubtitle(R.string.rutina_editar_dia);
        toolbar.setNavigationIcon(R.drawable.flechahaciaatras);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RutinaDiaEditar.this, RutinaDiaDetalle.class);
                startActivity(intent);
            }
        });
    }

}