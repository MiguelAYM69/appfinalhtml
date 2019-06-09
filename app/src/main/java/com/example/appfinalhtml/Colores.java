package com.example.appfinalhtml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Colores extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);


    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(Colores.this,MainActivity.class);
        startActivity(a);
        finish();
    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(Colores.this,Numeros.class);
        startActivity(a);
        finish();
    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(Colores.this,Abecedario.class);
        startActivity(a);
        finish();
    }

    public void pcuerpoIntent(View view) {
        Intent a = new Intent(Colores.this,PPartes.class);
        startActivity(a);
        finish();
    }

    public void   PComunesIntent(View view) {
        Intent a = new Intent(Colores.this,PComunes.class);
        startActivity(a);
        finish();


    }
}
