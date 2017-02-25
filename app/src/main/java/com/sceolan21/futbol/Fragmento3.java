package com.sceolan21.futbol;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class Fragmento3 extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_unpanel);

        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putString("identificador", getIntent().getStringExtra("identificador"));

            switch (getIntent().getStringExtra("identificador")) {
                case "0":
                    Lista1 fragment1 = new Lista1();
                    fragment1.setArguments(arguments);
                    Lista1.PAIS_BUSCADO= getIntent().getStringExtra("identificador");
                    getSupportFragmentManager().beginTransaction().add(R.id.frame_contenedor, fragment1).commit();
                    break;
                case "1":
                    Lista1 fragment2 = new Lista1();
                    fragment2.setArguments(arguments);
                    Lista1.PAIS_BUSCADO= getIntent().getStringExtra("identificador");
                    getSupportFragmentManager().beginTransaction().add(R.id.frame_contenedor, fragment2).commit();
                    break;
                case "2":
                    Lista1 fragment3 = new Lista1();
                    fragment3.setArguments(arguments);
                    Lista1.PAIS_BUSCADO= getIntent().getStringExtra("identificador");
                    getSupportFragmentManager().beginTransaction().add(R.id.frame_contenedor, fragment3).commit();
                    break;
                default:
                    Lista1 fragment4 = new Lista1();
                    fragment4.setArguments(arguments);
                    Lista1.PAIS_BUSCADO= getIntent().getStringExtra("identificador");
                    getSupportFragmentManager().beginTransaction().add(R.id.frame_contenedor, fragment4).commit();
                    break;

            }
        }
    }
}
