package com.sceolan21.futbol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Lista1 extends ListFragment {
    public int i;
    public static String PAIS_BUSCADO;
    public ArrayList<Contenido.Lista_entrada2> ENTRADAS_FINAL = new ArrayList<>();
    public Lista1() {
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            ENTRADAS_FINAL.clear();
            ENTRADAS_FINAL = (ArrayList)Contenido.ENTRADAS_LISTA2.clone();
            for (i=ENTRADAS_FINAL.size()-1;i>=0;i--){
                    if (!ENTRADAS_FINAL.get(i).pais.equals(PAIS_BUSCADO)){
                   ENTRADAS_FINAL.remove(i);
              }
            }

            setListAdapter(new Adaptador(getActivity(), R.layout.layout_listado2,  ENTRADAS_FINAL) {
                @Override
                public void onEntrada(Object entrada, View view) {
                    if (entrada != null) {
                       TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textotitulo);
                            if (texto_superior_entrada != null)
                               texto_superior_entrada.setText(((Contenido.Lista_entrada2) entrada).texto);
                            ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imagenlista);
                            if (imagen_entrada != null)
                                 imagen_entrada.setImageResource(((Contenido.Lista_entrada2) entrada).idImagen);
                    }
                }
            });

        }

        @Override
        public void onListItemClick(ListView listView, View view, int posicion, long id) {
            super.onListItemClick(listView, view, posicion, id);
            if (Futbol.dosFragmentos) {
                Integer y=(int)id;
                Bundle arguments = new Bundle();
                arguments.putString("identificador",  ENTRADAS_FINAL.get(y).id);
                FragmentoWeb fragment = new FragmentoWeb();
                fragment.setArguments(arguments);
                getFragmentManager().beginTransaction().replace(R.id.frame_contenedor, fragment).commit();

            } else {
                Intent detailIntent = new Intent(getActivity(), Fragmentos.class);
                Integer y=(int)id;
                detailIntent.putExtra("identificador", ENTRADAS_FINAL.get(y).id);
                startActivity(detailIntent);
            }
        }



            //Toast toast1 =
            //     Toast.makeText(getActivity(),"tocado el "+id, Toast.LENGTH_SHORT);
            //toast1.show();



        }
