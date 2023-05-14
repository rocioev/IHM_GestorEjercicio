package com.example.ihm_gestorejercicio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setBottomNavigationView();
        setToolBar();
    }

    public void pasoRegistrarEntreno (View v) {
        Intent intent = new Intent(v.getContext(), RutinasDetalle.class);
        startActivity(intent);
    }

    public void pasoChat (View v) {
        Intent intent = new Intent(v.getContext(), chatPro.class);
        startActivity(intent);
    }




    private void setToolBar(){
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.btn_home);

    }

    private void setBottomNavigationView() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_rutinas:
                    startActivity(new Intent(getApplicationContext(), Rutinas.class));
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
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