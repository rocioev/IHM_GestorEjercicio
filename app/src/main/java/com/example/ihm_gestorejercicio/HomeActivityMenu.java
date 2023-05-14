package com.example.ihm_gestorejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HomeActivityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);
        Button adjust = findViewById(R.id.ajustes);
        Button chat = findViewById(R.id.Chat);
        Button premuim = findViewById(R.id.Prem);

        adjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivityMenu.this, Configuracion.class);
                startActivity(intent);
            }
        });
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivityMenu.this, chatPro.class);
                startActivity(intent);
            }
        });
        premuim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivityMenu.this, PremiumActivity.class);
                startActivity(intent);
            }
        });
    }
}