package com.example.ac1guiadesorocaba;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class zoologico extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_zoologico);

        Button btn_vermapa = findViewById(R.id.btn_vermapa);
        btn_vermapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Latitude e longitude da localização desejada
                String endereco = "Rua Teodoro Kaisel, 883, Vila Hortência, Sorocaba, SP";

                // Cria uma URI com os parâmetros da localização
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(endereco));

                // Cria um Intent para abrir o aplicativo de mapas
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                // Define o pacote do Google Maps (opcional, para garantir que o Google Maps seja usado)
                mapIntent.setPackage("com.google.android.apps.maps");

                // Verifica se há um aplicativo de mapas disponível
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    // Caso não haja aplicativo de mapas disponível, você pode lidar com isso aqui.
                }
            }
        });
        Button btn_abrirsite = findViewById(R.id.btn_abrirsite);
        btn_abrirsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // URL do site que você deseja abrir
                String urlDoSite = "https://www.sorocaba.sp.gov.br/zoologico/";

                // Cria um Intent com a ação ACTION_VIEW
                Intent intent = new Intent(Intent.ACTION_VIEW);

                // Define a URI do site como o dado do Intent
                intent.setData(Uri.parse(urlDoSite));

                // Inicia o navegador padrão com o URL
                startActivity(intent);
            }
        });

        Button btn_tel = findViewById(R.id.btn_telefone);

        btn_tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Número de telefone que você deseja chamar
                String numeroTelefone = "(15) 99115-4936"; // Substitua pelo número real

                // Cria um Intent com a ação ACTION_DIAL
                Intent intent = new Intent(Intent.ACTION_DIAL);

                // Define o URI com o número de telefone
                intent.setData(Uri.parse("tel:" + numeroTelefone));

                // Inicia a chamada telefônica
                startActivity(intent);
            }
        });
    }
}
