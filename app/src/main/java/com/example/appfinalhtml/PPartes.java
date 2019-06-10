package com.example.appfinalhtml;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PPartes extends AppCompatActivity {

    MediaPlayer mm,mp,mo,mb,mbr,mpi,mc,md,mr,mn,mpn;
    ImageButton imano,pie,ojo,boca,mano,pierna,cabeza,dedos,rodilla,nariz,panza;
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
