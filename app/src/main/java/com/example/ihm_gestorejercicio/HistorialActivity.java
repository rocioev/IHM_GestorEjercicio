package com.example.ihm_gestorejercicio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HistorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        //Llamar al método que gestiona la barra baja de navegación
        setBottomNavigationView();
        setToolBar();
        setCalendario();

    }

    private void setCalendario() {

        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView v, int year, int month, int dayOfMonth) {
                Intent intent = new Intent(v.getContext(), HistorialActivityDetalleDia.class);
                startActivity(intent);
                // setContentView(R.layout.activity_historial_detalle_dia);
            }
        });
    }

    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), HistorialActivityDetalleDia.class);
                startActivity(intent);
            }
        });
    }

    private void setBottomNavigationView() {

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.navigation_historial);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.navigation_rutinas:
                    startActivity(new Intent(getApplicationContext(), Rutinas.class));
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.navigation_historial:
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