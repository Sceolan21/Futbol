package com.sceolan21.futbol;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Fragmentos extends FragmentActivity {
    public static final String ARG_SECTION_TITLE = "opcion";

    public Fragmentos() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_unpanel);

        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putString("identificador", getIntent().getStringExtra("identificador"));
            Fragmento2 fragment = new Fragmento2();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.frame_contenedor, fragment).commit();
        }
    }

    public static Fragmentos newInstance(String sectionTitle) {
        Fragmentos fragment = new Fragmentos();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        //fragment.setArguments(args);
        return fragment;
    }

}