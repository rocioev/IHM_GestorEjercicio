package com.example.ihm_gestorejercicio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Rutinas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutinas);
        setBottomNavigationView();
        setToolBar();

        ImageView pushpullleg = findViewById(R.id.pushpullleg);
        pushpullleg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rutinas.this, RutinasDetalle.class);
                startActivity(intent);
            }
        });
    }

    private void setToolBar(){
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.btn_rutinas);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void setBottomNavigationView() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.navigation_rutinas);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.navigation_rutinas:
                    return true;
                case R.id.navigation_historial:
                    startActivity(new Intent(getApplicationContext(), HistorialActivity.class));
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.navigation_perfil:
                    startActivity(new Intent(getApplicationContext(), Perfil.class));
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
            }
            return false;
        });
    }
}