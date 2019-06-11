package com.example.appfinalhtml;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PComunes extends AppCompatActivity {


    MediaPlayer comoestas;
    MediaPlayer quehaces;
    MediaPlayer buenosdias;
    MediaPlayer buenasnoches;
    MediaPlayer buenastardes;
    MediaPlayer gracias;
    MediaPlayer no;
    MediaPlayer bueno;
    MediaPlayer teamo;
    MediaPlayer amigos;
    MediaPlayer vamosacaminar;
    MediaPlayer vamosacomer;
    MediaPlayer quierotomaragua;
    MediaPlayer aquies;
    ImageButton sonido,idos,itres,icuatro,icinco,iseis,isiete,iocho,inueve,ionce, idoce, itrece, icatorce, iquince;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcomunes);



        idos= (ImageButton) findViewById(R.id.idos);
        quehaces= MediaPlayer.create(this, R.raw.quehaces);
        idos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quehaces.start();
            }
        });

        itres= (ImageButton) findViewById(R.id.itres);
        buenosdias= MediaPlayer.create(this, R.raw.buenosdias);
        itres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buenosdias.start();
            }
        });

        icuatro= (ImageButton) findViewById(R.id.icuatro);
        buenasnoches= MediaPlayer.create(this, R.raw.buenasnoches);
        icuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buenasnoches.start();
            }
        });

        icinco= (ImageButton) findViewById(R.id.icinco);
        buenastardes= MediaPlayer.create(this, R.raw.buenastardes);
        icinco .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buenastardes.start();
            }
        });

        iseis= (ImageButton) findViewById(R.id.iseis);
        gracias= MediaPlayer.create(this, R.raw.gracias);
        iseis .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gracias.start();
            }
        });

        isiete= (ImageButton) findViewById(R.id.isiete);
        no= MediaPlayer.create(this, R.raw.no);
        isiete .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no.start();
            }
        });


        iocho= (ImageButton) findViewById(R.id.iocho);
        bueno= MediaPlayer.create(this, R.raw.bueno);
        iocho .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bueno.start();
            }
        });


        inueve= (ImageButton) findViewById(R.id.inueve);
        teamo= MediaPlayer.create(this, R.raw.teamo);
        inueve .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamo.start();
            }
        });

        ionce= (ImageButton) findViewById(R.id.ionce);
        amigos= MediaPlayer.create(this, R.raw.amigos);
        ionce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amigos.start();
            }
        });

        idoce= (ImageButton) findViewById(R.id.idoce);
        vamosacaminar= MediaPlayer.create(this, R.raw.vamosacaminar);
        idoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vamosacaminar.start();
            }
        });

        itrece= (ImageButton) findViewById(R.id.itrece);
        vamosacomer= MediaPlayer.create(this, R.raw.vamosacomer);
        itrece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vamosacomer.start();
            }
        });

        icatorce= (ImageButton) findViewById(R.id.icatorce);
        quierotomaragua= MediaPlayer.create(this, R.raw.quierotomaragua);
        icatorce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quierotomaragua.start();
            }
        });

        iquince= (ImageButton) findViewById(R.id.iquince);
        aquies= MediaPlayer.create(this, R.raw.aquies);
        iquince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aquies.start();
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