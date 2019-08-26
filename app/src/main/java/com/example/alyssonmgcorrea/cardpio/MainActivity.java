package com.example.alyssonmgcorrea.cardpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.alyssonmgcorrea.cardpio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirCostela(View v){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Costelas");
        startActivity(intent);
    }
    public void abrirKibe(View kibe){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Quibes");
        startActivity(intent);
    }
    public void abrirLasanha(View lasanha){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Lasanhas");
        startActivity(intent);
    }
    public void abrirTorta(View torta){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Tortas");
        startActivity(intent);
    }
}
