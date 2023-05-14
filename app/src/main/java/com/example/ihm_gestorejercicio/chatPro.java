package com.example.ihm_gestorejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class chatPro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_pro);

        ImageView flechaatras = findViewById(R.id.flechaAtras);
        flechaatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chatPro.this, Perfil.class);
                startActivity(intent);
            }
        });
    }
}