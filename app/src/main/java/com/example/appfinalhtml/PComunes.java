package com.example.appfinalhtml;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PComunes extends AppCompatActivity {


    MediaPlayer mc;

    ImageButton comoestas;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcomunes);



        comoestas= (ImageButton) findViewById(R.id.sonido1);
       mc= MediaPlayer.create(this, R.raw.comoestas);
        comoestas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mc.start();
            }
        });



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