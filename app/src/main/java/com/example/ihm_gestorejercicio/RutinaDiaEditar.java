package com.example.ihm_gestorejercicio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class RutinaDiaEditar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_dia_editar);
        setToolBar();
    }

    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.nom_dia_rutina);
        getSupportActionBar().setSubtitle(R.string.rutina_editar_dia);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RutinaDiaEditar.this, RutinaDiaDetalle.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.search) {
            Intent intent = new Intent(RutinaDiaEditar.this, BuscarEjerciciosActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}