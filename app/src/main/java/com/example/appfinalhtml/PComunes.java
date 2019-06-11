package com.example.appfinalhtml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PComunes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcomunes);
    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(PComunes.this,Colores.class);
        startActivity(a);
        finish();
    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(PComunes.this,Numeros.class);
        startActivity(a);
        finish();

    }

    public void pcuerpoIntent(View view) {
        Intent a = new Intent(PComunes.this,PPartes.class);
        startActivity(a);
        finish();
    }

    public void  AnimalesIntent(View view) {
        Intent a = new Intent(PComunes.this,MainActivity.class);
        startActivity(a);
        finish();

    }

}