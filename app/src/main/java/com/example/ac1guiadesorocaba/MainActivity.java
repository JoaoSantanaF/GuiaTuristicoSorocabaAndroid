package com.example.ac1guiadesorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_redirezoo = findViewById(R.id.btn_smzoo);
        btn_redirezoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crie uma Intent para iniciar a nova atividade
                Intent intent = new Intent(MainActivity.this, zoologico.class);
                // Inicie a nova atividade
                startActivity(intent);
            }
        });

        Button btn_redirejdbot = findViewById(R.id.btn_smjdbot);
        btn_redirejdbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crie uma Intent para iniciar a nova atividade
                Intent intent = new Intent(MainActivity.this, jardim_bot.class);
                // Inicie a nova atividade
                startActivity(intent);
            }
        });

        Button btn_redirecate = findViewById(R.id.btn_smcate);
        btn_redirecate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crie uma Intent para iniciar a nova atividade
                Intent intent = new Intent(MainActivity.this, catedral.class);
                // Inicie a nova atividade
                startActivity(intent);
            }
        });
    }
}