package com.example.appfinalhtml;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Colores extends AppCompatActivity {

    MediaPlayer mv,mr,mro,mn,mm,mg,mf,mb,ma,mam;
    ImageButton verde,rosado,rojo,negro,morado,gris,cafe,blanco,azul,amarillo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);
       amarillo= (ImageButton) findViewById(R.id.amarillo);
        mam=MediaPlayer.create(this, R.raw.amarillo);
       amarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mam.start();
            }
        });
        verde= (ImageButton) findViewById(R.id.verde);
        mv=MediaPlayer.create(this, R.raw.verde);
       verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mv.start();
            }
        });
        rosado= (ImageButton) findViewById(R.id.rosado);
        mr=MediaPlayer.create(this, R.raw.rosado);
        rosado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mr.start();
            }
        });
     rojo= (ImageButton) findViewById(R.id.rojo);
        mro=MediaPlayer.create(this, R.raw.rojo);
      rojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mro.start();
            }
        });
        negro= (ImageButton) findViewById(R.id.negro);
        mn=MediaPlayer.create(this, R.raw.negro);
        negro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mn.start();
            }
        });
        morado= (ImageButton) findViewById(R.id.morado);
        mm=MediaPlayer.create(this, R.raw.morado);
        morado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mm.start();
            }
        });
        gris= (ImageButton) findViewById(R.id.gris);
        mg=MediaPlayer.create(this, R.raw.gris);
        gris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mg.start();
            }
        });
        cafe= (ImageButton) findViewById(R.id.cafe);
        mf=MediaPlayer.create(this, R.raw.cafe);
        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mf.start();
            }
        });
        blanco= (ImageButton) findViewById(R.id.blanco);
        mb=MediaPlayer.create(this, R.raw.blanco);
        blanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mb.start();
            }
        });
        azul= (ImageButton) findViewById(R.id.azul);
        ma=MediaPlayer.create(this, R.raw.azul);
        azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.start();
            }
        });
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
