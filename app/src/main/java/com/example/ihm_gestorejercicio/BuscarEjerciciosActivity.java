package com.example.ihm_gestorejercicio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;


public class BuscarEjerciciosActivity extends AppCompatActivity {

    private ListView listView;
    ArrayAdapter<String> adapter;
    String[] listaEjercicios = {"Sentadilla", "Dominadas", "Zancada", "Plancha", "Peso muerto", "Remo"};
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_ejercicios);
        setToolBar();

        listView = findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter<String>(BuscarEjerciciosActivity.this, android.R.layout.simple_dropdown_item_1line, listaEjercicios);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Toast.makeText(BuscarEjerciciosActivity.this, "Se ha añadido el ejercicio " + listaEjercicios[index], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(BuscarEjerciciosActivity.this, RutinaDiaEditar.class);
                startActivity(intent);
            }
        });
    }

    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Seleccionar ejercicio");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuscarEjerciciosActivity.this, RutinasDetalle.class);
                startActivity(intent);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Burcar ejercicio");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.search) {
            Intent intent = new Intent(BuscarEjerciciosActivity.this, BuscarEjerciciosActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}