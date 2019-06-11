package com.example.appfinalhtml;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mjag,mgu,mco,mte,mga,mpu,mjab,mlor,mve,mpe,mper,mig,mra,mtu;
    ImageButton jaguar,guacamaya,colibri,tejon,gato,puerquito,jabali,loro,venado,pez,perro,iguana,raton,tucan;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jaguar= (ImageButton) findViewById(R.id.jaguar);
        mjag=MediaPlayer.create(this, R.raw.jaguar);
        jaguar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mjag.start();

            }
        });
        guacamaya= (ImageButton) findViewById(R.id.guacamaya);
        mgu=MediaPlayer.create(this, R.raw.guacamaya);
        guacamaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgu.start();
            }
        });
        colibri= (ImageButton) findViewById(R.id.colibri);
        mco=MediaPlayer.create(this, R.raw.colibri);
        colibri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mco.start();
            }
        });
        tejon= (ImageButton) findViewById(R.id.tejon);
        mte=MediaPlayer.create(this, R.raw.tejon);
        tejon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mte.start();
            }
        });
        gato= (ImageButton) findViewById(R.id.gato);
        mga=MediaPlayer.create(this, R.raw.gato);
        gato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mga.start();
            }
        });
        puerquito= (ImageButton) findViewById(R.id.puerquito);
        mpu=MediaPlayer.create(this, R.raw.puerquito);
        puerquito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpu.start();
            }
        });
        jabali= (ImageButton) findViewById(R.id.jabali);
        mjab=MediaPlayer.create(this, R.raw.jabali);
        jabali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mjab.start();
            }
        });
       loro= (ImageButton) findViewById(R.id.loro);
        mlor=MediaPlayer.create(this, R.raw.loro);
        loro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlor.start();
            }
        });
     venado= (ImageButton) findViewById(R.id.venado);
        mve=MediaPlayer.create(this, R.raw.venado);
        venado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mve.start();
            }
        });
pez= (ImageButton) findViewById(R.id.pez);
        mpe=MediaPlayer.create(this, R.raw.pez);
       pez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpe.start();
            }
        });
       perro= (ImageButton) findViewById(R.id.perro);
        mper=MediaPlayer.create(this, R.raw.perro);
       perro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mper.start();
            }
        });
       iguana= (ImageButton) findViewById(R.id.iguana);
        mig=MediaPlayer.create(this, R.raw.iguana);
        iguana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mig.start();
            }
        });
        raton= (ImageButton) findViewById(R.id.raton);
        mra=MediaPlayer.create(this, R.raw.raton);
        raton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mra.start();
            }
        });
        tucan= (ImageButton) findViewById(R.id.tucan);
        mtu=MediaPlayer.create(this, R.raw.tucan);
        tucan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtu.start();
            }
        });
    }


    public void ColoresIntent(View view) {
        Intent a = new Intent(MainActivity.this,Colores.class);
        startActivity(a);
        finish();

    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(MainActivity.this,Numeros.class);
        startActivity(a);
        finish();

    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(MainActivity.this,Abecedario.class);
        startActivity(a);
        finish();

    }

    public void pcuerpoIntent(View view) {
        Intent a = new Intent(MainActivity.this,PPartes.class);
        startActivity(a);
        finish();

    }

    public void  PComunesIntent(View view) {
        Intent a = new Intent(MainActivity.this,PComunes.class);
        startActivity(a);
        finish();


    }

}












