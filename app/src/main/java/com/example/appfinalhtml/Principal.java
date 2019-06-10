package com.example.appfinalhtml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Principal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }


    public void ColoresIntent(View view) {
        Intent a = new Intent(Principal.this,Colores.class);
        startActivity(a);

    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(Principal.this,Numeros.class);
        startActivity(a);

    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(Principal.this,Abecedario.class);
        startActivity(a);

    }

    public void pcuerpoIntent(View view) {
        Intent a = new Intent(Principal.this,PPartes.class);
        startActivity(a);

    }

    public void  PComunesIntent(View view) {
        Intent a = new Intent(Principal.this,PComunes.class);
        startActivity(a);
    }

    public void  AnimalesIntent(View view) {
        Intent a = new Intent(Principal.this,MainActivity.class);
        startActivity(a);



    }
}