package com.sceolan21.futbol;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.media.SoundPool;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

import static android.content.res.Configuration.ORIENTATION_PORTRAIT;

public class Futbol extends AppCompatActivity implements Fragmento1.Callbacks{

    public static boolean dosFragmentos;

    private DrawerLayout drawerLayout;
    private String titulo;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futbol);
        setToolbar();
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView)
                findViewById(R.id.navigator);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }
        titulo = "hola";
        if (savedInstanceState == null) {
            //selectItem(titulo);
        }

        if (findViewById(R.id.frame_contenedor) != null) {
            dosFragmentos = true;
        }

        mp = MediaPlayer.create(this, R.raw.sonido);
    }


    @Override
    public void onEntradaSelecionada(String id) {
        if (dosFragmentos) {

            Bundle arguments = new Bundle();
            arguments.putString("identificador", id);
            Lista1 fragment = new Lista1();
            Lista1.PAIS_BUSCADO= id;
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_contenedor, fragment).commit();

        } else {
            Intent detailIntent = new Intent(this, Fragmento3.class);
            detailIntent.putExtra("identificador", id);
            startActivity(detailIntent);
        }
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setHomeAsUpIndicator(R.drawable.menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }
    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.laliga:
                                Intent intent = new Intent(getApplicationContext(), Video.class);
                                intent.putExtra("tituloVideo", "La Liga Santander");
                                intent.putExtra("rutaVideo", "android.resource://com.sceolan21.futbol/"+R.raw.laliga);
                                startActivityForResult(intent, 0);
                                return true;
                            case R.id.laliga2:
                                intent = new Intent(getApplicationContext(), Video.class);
                                intent.putExtra("tituloVideo", "La Liga 1, 2, 3");
                                intent.putExtra("rutaVideo", "android.resource://com.sceolan21.futbol/"+R.raw.laliga2);
                                startActivityForResult(intent, 0);
                                return true;
                            case R.id.premier:
                                intent = new Intent(getApplicationContext(), Video.class);
                                intent.putExtra("tituloVideo", "Premier League");
                                intent.putExtra("rutaVideo", "android.resource://com.sceolan21.futbol/"+R.raw.premier);
                                startActivityForResult(intent, 0);
                                return true;
                            case R.id.bundesliga:
                                intent = new Intent(getApplicationContext(), Video.class);
                                intent.putExtra("tituloVideo", "Bundesliga");
                                intent.putExtra("rutaVideo", "android.resource://com.sceolan21.futbol/"+R.raw.bundesliga);
                                startActivityForResult(intent, 0);
                                return true;
                            case R.id.seriea:
                                intent = new Intent(getApplicationContext(), Video.class);
                                intent.putExtra("tituloVideo", "Serie A");
                                intent.putExtra("rutaVideo", "android.resource://com.sceolan21.futbol/"+R.raw.seriea);
                                startActivityForResult(intent, 0);
                                return true;
                        }
                        return true;
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);

                return true;
            case R.id.iniciarsonido:
                mp.start();
                Toast toast1 = Toast.makeText(getApplicationContext(), "Iniciar Sonido", Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 150);
                toast1.show();
                return true;
            case R.id.pausarsonido:
                mp.pause();
                Toast toast2 = Toast.makeText(getApplicationContext(), "Pausando Sonido", Toast.LENGTH_SHORT);
                toast2.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 150);
                toast2.show();
                return true;
            case R.id.pararsonido:
                mp.stop();
                try {
                    mp.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast toast3 = Toast.makeText(getApplicationContext(), "Parar Sonido", Toast.LENGTH_SHORT);
                toast3.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 150);
                toast3.show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
