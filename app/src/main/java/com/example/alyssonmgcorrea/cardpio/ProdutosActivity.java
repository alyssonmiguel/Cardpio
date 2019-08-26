package com.example.alyssonmgcorrea.cardpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProdutosActivity extends AppCompatActivity {

    private TextView textViewTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        textViewTitulo =findViewById(R.id.textViewTitulo);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        textViewTitulo.setText(titulo);
    }
}
