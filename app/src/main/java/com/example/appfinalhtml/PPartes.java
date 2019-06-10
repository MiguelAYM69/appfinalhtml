package com.example.appfinalhtml;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PPartes extends AppCompatActivity {

    MediaPlayer mm,mp,mo,mb,mbr,mpi,mc,md,mpn,nari,cu;
    ImageButton imano,pie,ojo,boca,brazo,pierna,cabeza,dedos,cuello,nariz,panza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppartes);

        imano= (ImageButton) findViewById(R.id.imano);
        mm= MediaPlayer.create(this, R.raw.mano);
       imano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mm.start();
            }
        });

        pie= (ImageButton) findViewById(R.id.ipie);
        mp= MediaPlayer.create(this, R.raw.pierna);
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
       ojo= (ImageButton) findViewById(R.id.iojo);
        mo= MediaPlayer.create(this, R.raw.ojo);
        ojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mo.start();
            }
        });
        boca= (ImageButton) findViewById(R.id.iboca);
        mb= MediaPlayer.create(this, R.raw.boca);
        boca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mb.start();
            }
        });
        brazo= (ImageButton) findViewById(R.id.ibrazo);
        mbr= MediaPlayer.create(this, R.raw.brazo);
       brazo .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbr.start();
            }
        });
        pierna= (ImageButton) findViewById(R.id.ipierna);
        mpi= MediaPlayer.create(this, R.raw.rodia);
        pierna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpi.start();
            }
        });
        cabeza= (ImageButton) findViewById(R.id.icabeza);
        mc= MediaPlayer.create(this, R.raw.cabeza);
        cabeza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mc.start();
            }
        });
       dedos= (ImageButton) findViewById(R.id.idedos);
        md= MediaPlayer.create(this, R.raw.dedos);
        dedos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
            }
        });
        panza= (ImageButton) findViewById(R.id.ipechos);
        mpn= MediaPlayer.create(this, R.raw.panza);
        panza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpn.start();
            }
        });
        nariz= (ImageButton) findViewById(R.id.inariz);
        nari= MediaPlayer.create(this, R.raw.nariz);
        nariz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nari.start();
            }
        });

    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(PPartes.this,Colores.class);
        startActivity(a);
        finish();
    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(PPartes.this,Numeros.class);
        startActivity(a);
        finish();
    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(PPartes.this,Abecedario.class);
        startActivity(a);
        finish();
    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(PPartes.this,MainActivity.class);
        startActivity(a);
        finish();
    }

    public void PComunesIntent(View view) {
        Intent a = new Intent(PPartes.this,PComunes.class);
        startActivity(a);
        finish();
    }
}
