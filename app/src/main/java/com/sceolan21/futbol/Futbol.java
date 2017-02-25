package com.sceolan21.futbol;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.content.res.Configuration.ORIENTATION_PORTRAIT;

public class Futbol extends FragmentActivity implements Fragmento1.Callbacks{

    public static boolean dosFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.getResources().getConfiguration().orientation == ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_futbol);
        }else{
            setContentView(R.layout.layout_dospaneles);
        }

        if (findViewById(R.id.frame_contenedor) != null) {
            dosFragmentos = true;
        }
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
}
