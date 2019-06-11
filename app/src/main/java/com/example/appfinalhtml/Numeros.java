package com.example.appfinalhtml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Numeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(Numeros.this,Colores.class);
        startActivity(a);
        finish();
    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(Numeros.this,Colores.class);
        startActivity(a);
        finish();
    }




    public void pcuerpoIntent(View view) {
        Intent a = new Intent(Numeros.this,PPartes.class);
        startActivity(a);
        finish();
    }

    public void PComunesIntent(View view) {
        Intent a = new Intent(Numeros.this,PComunes.class);
        startActivity(a);
        finish();



    }
}
