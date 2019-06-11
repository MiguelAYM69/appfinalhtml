package com.example.appfinalhtml;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Numeros extends AppCompatActivity {

    MediaPlayer m0,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m20,m30,m40,m50,m100;
    ImageButton cero,uno, dos, tres, cuatro, cinco, seis, siete, ocho,nueve,diez,once, doce, trece, catorce, quince, deiciseis, diescisiete, diesciocho, dieciocho, diecinueve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

      cero= (ImageButton) findViewById(R.id.uno);
        m0 = MediaPlayer.create(this, R.raw.acero);
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m0.start();
            }
        });

     uno= (ImageButton) findViewById(R.id.dos);
       m1 = MediaPlayer.create(this, R.raw.auno);
       uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.start();
            }
        });
        dos= (ImageButton) findViewById(R.id.tres);
        m2 = MediaPlayer.create(this, R.raw.ados);
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.start();
            }
        });
        tres= (ImageButton) findViewById(R.id.cuatro);
        m3= MediaPlayer.create(this, R.raw.atres);
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3.start();
            }
        });
        cuatro= (ImageButton) findViewById(R.id.cinco);
        m4 = MediaPlayer.create(this, R.raw.acuatro);
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4.start();
            }
        });
        cinco= (ImageButton) findViewById(R.id.seis);
        m5 = MediaPlayer.create(this, R.raw.acinco);
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5.start();
            }
        });
        seis= (ImageButton) findViewById(R.id.siete);
        m6 = MediaPlayer.create(this, R.raw.aseis);
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m6.start();
            }
        });
        siete= (ImageButton) findViewById(R.id.ocho);
        m7 = MediaPlayer.create(this, R.raw.asiete);
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m7.start();
            }
        });
       ocho= (ImageButton) findViewById(R.id.nueve);
        m8 = MediaPlayer.create(this, R.raw.aocho);
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m8.start();
            }
        });
      nueve= (ImageButton) findViewById(R.id.diez);
        m9= MediaPlayer.create(this, R.raw.anueve);
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m9.start();
            }
        });
        diez= (ImageButton) findViewById(R.id.once);
        m10 = MediaPlayer.create(this, R.raw.adiez);
        diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m10.start();
            }
        });
        once= (ImageButton) findViewById(R.id.doce);
        m20 = MediaPlayer.create(this, R.raw.aveinte);
        once.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m20.start();
            }
        });
        doce= (ImageButton) findViewById(R.id.trece);
        m30 = MediaPlayer.create(this, R.raw.atreinta);
        doce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m30.start();
            }
        });
        trece= (ImageButton) findViewById(R.id.catorce);
        m40 = MediaPlayer.create(this, R.raw.acuarenta);
        trece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m40.start();
            }
        });
        catorce= (ImageButton) findViewById(R.id.quince);
        m50 = MediaPlayer.create(this, R.raw.acincuenta);
        catorce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m50.start();
            }
        });
        /*quince= (ImageButton) findViewById(R.id.diecinueve);
        m100 = MediaPlayer.create(this, R.raw.acien);
        quince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m100.start();
            }
        });*/
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
