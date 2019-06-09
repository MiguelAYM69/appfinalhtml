package com.example.appfinalhtml;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(MainActivity.this,Colores.class);
        startActivity(a);

    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(MainActivity.this,Numeros.class);
        startActivity(a);

    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(MainActivity.this,Abecedario.class);
        startActivity(a);

    }

    public void pcuerpoIntent(View view) {
        Intent a = new Intent(MainActivity.this,PPartes.class);
        startActivity(a);

    }

    public void  PComunesIntent(View view) {
        Intent a = new Intent(MainActivity.this,PComunes.class);
        startActivity(a);


    }

}



