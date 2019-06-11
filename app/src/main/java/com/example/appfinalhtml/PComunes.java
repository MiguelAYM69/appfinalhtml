package com.example.appfinalhtml;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PComunes extends AppCompatActivity {


    MediaPlayer mc,mcdos,mctres,mccuatro,mccinco,mconce,
            mcsiete,mcocho,mcnueve,mcdiez,mcdoce,mctrece,mccatorce;

    ImageButton comoestas,quehaces,buenosdias,buenasnoches,buenastardes,
            vamosacaminar,no,bueno,teamo,amigos,vamosacomer,quierotomaragua,aquies;

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

        quehaces= (ImageButton) findViewById(R.id.sonido2);
        mcdos= MediaPlayer.create(this, R.raw.quehaces);
        quehaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcdos.start();
            }
        });
        buenosdias= (ImageButton) findViewById(R.id.sonido3);
        mctres= MediaPlayer.create(this, R.raw.buenosdias);
        buenosdias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mctres.start();
            }
        });

        buenasnoches= (ImageButton) findViewById(R.id.sonido4);
        mccuatro= MediaPlayer.create(this, R.raw.buenasnoches);
        buenasnoches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mccuatro.start();
            }
        });
        buenastardes= (ImageButton) findViewById(R.id.sonido5);
        mccinco= MediaPlayer.create(this, R.raw.buenastardes);
        buenastardes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mccinco.start();
            }
        });


        no= (ImageButton) findViewById(R.id.sonido7);
        mcsiete= MediaPlayer.create(this, R.raw.no);
       no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcsiete.start();
            }
        });
        bueno= (ImageButton) findViewById(R.id.sonido8);
        mcocho= MediaPlayer.create(this, R.raw.bueno);
        bueno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcocho.start();
            }
        });
        teamo= (ImageButton) findViewById(R.id.sonido9);
        mcnueve= MediaPlayer.create(this, R.raw.teamo);
        teamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcnueve.start();
            }
        });

        amigos= (ImageButton) findViewById(R.id.sonido10);
        mcdiez= MediaPlayer.create(this, R.raw.amigos);
        amigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcdiez.start();
            }
        });
        vamosacaminar= (ImageButton) findViewById(R.id.sonido11);
        mconce= MediaPlayer.create(this, R.raw.vamosacaminar);
        vamosacaminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mconce.start();
            }
        });
        vamosacomer= (ImageButton) findViewById(R.id.sonido12);
        mcdoce= MediaPlayer.create(this, R.raw.vamosacomer);
        vamosacomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcdoce.start();
            }
        });
        quierotomaragua= (ImageButton) findViewById(R.id.sonido13);
        mctrece= MediaPlayer.create(this, R.raw.quierotomaragua);
        quierotomaragua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mctrece.start();
            }
        });
       aquies= (ImageButton) findViewById(R.id.sonido14);
        mccatorce= MediaPlayer.create(this, R.raw.aquies);
        aquies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mccatorce.start();
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