package com.sceolan21.futbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contenido {
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();
    public static ArrayList<Lista_entrada2> ENTRADAS_LISTA2 = new ArrayList<Lista_entrada2>();
    public static ArrayList<Lista_entrada2> ENTRADAS_LISTA3 = new ArrayList<Lista_entrada2>();
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();
    public static Map<String, Lista_entrada2> ENTRADAS_LISTA_HASHMAP2 = new HashMap<String, Lista_entrada2>();
    public static Map<String, Lista_entrada2> ENTRADAS_LISTA_HASHMAP3 = new HashMap<String, Lista_entrada2>();

    static{
        aniadirEntrada(new Lista_entrada("0", R.drawable.liga, "La Liga Santander"));
        aniadirEntrada(new Lista_entrada("1", R.drawable.liga123, "La Liga 1, 2, 3"));
        aniadirEntrada(new Lista_entrada("2", R.drawable.premier, "Premier League"));
        aniadirEntrada(new Lista_entrada("3", R.drawable.bundesliga, "Bundesliga"));
        aniadirEntrada(new Lista_entrada("4", R.drawable.seriea, "Serie A"));

        aniadirEntrada2(new Lista_entrada2("0", "0", R.drawable.barcelona, "FC Barcelona","https://www.fcbarcelona.es/"));
        aniadirEntrada2(new Lista_entrada2("1", "0", R.drawable.alaves, "Deportivo Alaves","http://www.deportivoalaves.com/"));
        aniadirEntrada2(new Lista_entrada2("2", "0", R.drawable.atletico, "Atletico Madrid","https://www.atleticodemadrid.com/"));
        aniadirEntrada2(new Lista_entrada2("3", "0", R.drawable.betis, "Real Betis","http://www.realbetisbalompie.es/en/"));
        aniadirEntrada2(new Lista_entrada2("4", "0", R.drawable.bilbao, "Athletic Club","http://www.athletic-club.eus/cas/home.html"));
        aniadirEntrada2(new Lista_entrada2("5", "0", R.drawable.celta, "Real Club Celta de Vigo","http://www.celtavigo.net/es/"));
        aniadirEntrada2(new Lista_entrada2("6", "0", R.drawable.depor, "Real Club Deportivo de la Coruña","http://www.rcdeportivo.es/"));
        aniadirEntrada2(new Lista_entrada2("7", "0", R.drawable.eibar, "SD Eibar","http://www.sdeibar.com/"));
        aniadirEntrada2(new Lista_entrada2("8", "0", R.drawable.espanyol, "Real Club Deportivo Espanyol","http://www.rcdespanyol.com/"));
        aniadirEntrada2(new Lista_entrada2("9", "0", R.drawable.granada, "Granada CF","http://www.granadacf.es/"));
        aniadirEntrada2(new Lista_entrada2("10", "0", R.drawable.laspalmas, "Las Palmas CF","http://www.udlaspalmas.es/"));
        aniadirEntrada2(new Lista_entrada2("11", "0", R.drawable.leganes, "CD Leganés","http://www.deportivoleganes.com/"));
        aniadirEntrada2(new Lista_entrada2("12", "0", R.drawable.madrid, "Real Madrid","http://www.realmadrid.com/"));
        aniadirEntrada2(new Lista_entrada2("13", "0", R.drawable.malaga, "Malaga CF","http://www.malagacf.com/"));
        aniadirEntrada2(new Lista_entrada2("14", "0", R.drawable.osasuna, "Club Atletico Osasuna","https://www.osasuna.es/"));
        aniadirEntrada2(new Lista_entrada2("15", "0", R.drawable.realsociedad, "Real Sociedad","http://www.realsociedad.com/"));
        aniadirEntrada2(new Lista_entrada2("16", "0", R.drawable.sevilla, "Sevilla FC","http://www.sevillafc.es/node/1"));
        aniadirEntrada2(new Lista_entrada2("17", "0", R.drawable.sporting, "Real Sporting de Gijón","http://www.realsporting.com/"));
        aniadirEntrada2(new Lista_entrada2("18", "0", R.drawable.valencia, "Valencia CF","http://www.valenciacf.com/"));
        aniadirEntrada2(new Lista_entrada2("19", "0", R.drawable.villareal, "Villareal","https://www.villarrealcf.es/"));

        aniadirEntrada2(new Lista_entrada2("20", "1", R.drawable.alcorcon, "AD Alcorcon","http://www.adalcorcon.com/"));
        aniadirEntrada2(new Lista_entrada2("21", "1", R.drawable.almeria, "UD Almeria","http://www.udalmeriasad.com/"));
        aniadirEntrada2(new Lista_entrada2("22", "1", R.drawable.cadiz, "Cadiz CF","http://www.cadizcf.com/"));
        aniadirEntrada2(new Lista_entrada2("23", "1", R.drawable.cordoba, "Cordoba CF","http://www.cordobacf.com/"));
        aniadirEntrada2(new Lista_entrada2("24", "1", R.drawable.elche, "Elche CF","http://www.elchecf.es/"));
        aniadirEntrada2(new Lista_entrada2("25", "1", R.drawable.getafe, "Getafe CF","http://www.getafecf.com/Home.aspx"));
        aniadirEntrada2(new Lista_entrada2("26", "1", R.drawable.girona, "Girona FC","http://www.gironafc.cat/"));
        aniadirEntrada2(new Lista_entrada2("27", "1", R.drawable.huesca, "SD Huesca","http://www.sdhuesca.es/"));
        aniadirEntrada2(new Lista_entrada2("28", "1", R.drawable.levante, "Levante UD","http://www.levanteud.com/es/"));
        aniadirEntrada2(new Lista_entrada2("29", "1", R.drawable.lugo, "CD Lugo","http://www.cdlugo.com/"));
        aniadirEntrada2(new Lista_entrada2("30", "1", R.drawable.mallorca, "RCD Mallorca","http://www.rcdmallorca.es/"));
        aniadirEntrada2(new Lista_entrada2("31", "1", R.drawable.mirandes, "CD Mirandes","http://www.cdmirandes.com/"));
        aniadirEntrada2(new Lista_entrada2("32", "1", R.drawable.nastic, "Nastic","http://www.gimnasticdetarragona.cat/es/"));
        aniadirEntrada2(new Lista_entrada2("33", "1", R.drawable.numancia, "CD Numancia","http://www.cdnumancia.com/"));
        aniadirEntrada2(new Lista_entrada2("34", "1", R.drawable.oviedo, "Real Oviedo","http://www.realoviedo.es/"));
        aniadirEntrada2(new Lista_entrada2("35", "1", R.drawable.rayo, "Rayo Vallecano","http://www.rayovallecano.es/"));
        aniadirEntrada2(new Lista_entrada2("36", "1", R.drawable.reus, "CF Reus","http://www.cfreusdeportiu.com/"));
        aniadirEntrada2(new Lista_entrada2("37", "1", R.drawable.sevillab, "Sevilla Atletico","http://www.sevillafc.es/equipos/sevilla-atletico"));
        aniadirEntrada2(new Lista_entrada2("38", "1", R.drawable.tenerife, "CD Tenerife","http://www.clubdeportivotenerife.es/"));
        aniadirEntrada2(new Lista_entrada2("39", "1", R.drawable.ucam, "UCAM Murcia CF","http://www.ucamdeportes.com/ucamcf/"));
        aniadirEntrada2(new Lista_entrada2("40", "1", R.drawable.valladolid, "Real Valladolid CF","http://www.realvalladolid.es/"));
        aniadirEntrada2(new Lista_entrada2("41", "1", R.drawable.zaragoza, "Real Zaragoza","http://www.realzaragoza.com/"));

        aniadirEntrada2(new Lista_entrada2("42", "1", R.drawable.cadiz, "Cadiz CF","http://www.cadizcf.com/"));
        aniadirEntrada2(new Lista_entrada2("43", "1", R.drawable.cordoba, "Cordoba CF","http://www.cordobacf.com/"));
        aniadirEntrada2(new Lista_entrada2("44", "1", R.drawable.elche, "Elche CF","http://www.elchecf.es/"));
        aniadirEntrada2(new Lista_entrada2("45", "1", R.drawable.getafe, "Getafe CF","http://www.getafecf.com/Home.aspx"));
        aniadirEntrada2(new Lista_entrada2("46", "1", R.drawable.girona, "Girona FC","http://www.gironafc.cat/"));
        aniadirEntrada2(new Lista_entrada2("47", "1", R.drawable.huesca, "SD Huesca","http://www.sdhuesca.es/"));
        aniadirEntrada2(new Lista_entrada2("48", "1", R.drawable.levante, "Levante UD","http://www.levanteud.com/es/"));
        aniadirEntrada2(new Lista_entrada2("49", "1", R.drawable.lugo, "CD Lugo","http://www.cdlugo.com/"));
        aniadirEntrada2(new Lista_entrada2("50", "1", R.drawable.mallorca, "RCD Mallorca","http://www.rcdmallorca.es/"));
        aniadirEntrada2(new Lista_entrada2("51", "1", R.drawable.mirandes, "CD Mirandes","http://www.cdmirandes.com/"));
        aniadirEntrada2(new Lista_entrada2("52", "1", R.drawable.nastic, "Nastic","http://www.gimnasticdetarragona.cat/es/"));
        aniadirEntrada2(new Lista_entrada2("53", "1", R.drawable.numancia, "CD Numancia","http://www.cdnumancia.com/"));
        aniadirEntrada2(new Lista_entrada2("54", "1", R.drawable.oviedo, "Real Oviedo","http://www.realoviedo.es/"));
        aniadirEntrada2(new Lista_entrada2("55", "1", R.drawable.rayo, "Rayo Vallecano","http://www.rayovallecano.es/"));
        aniadirEntrada2(new Lista_entrada2("56", "1", R.drawable.reus, "CF Reus","http://www.cfreusdeportiu.com/"));
        aniadirEntrada2(new Lista_entrada2("57", "1", R.drawable.sevillab, "Sevilla Atletico","http://www.sevillafc.es/equipos/sevilla-atletico"));
        aniadirEntrada2(new Lista_entrada2("58", "1", R.drawable.tenerife, "CD Tenerife","http://www.clubdeportivotenerife.es/"));
        aniadirEntrada2(new Lista_entrada2("59", "1", R.drawable.ucam, "UCAM Murcia CF","http://www.ucamdeportes.com/ucamcf/"));
        aniadirEntrada2(new Lista_entrada2("60", "1", R.drawable.valladolid, "Real Valladolid CF","http://www.realvalladolid.es/"));
        aniadirEntrada2(new Lista_entrada2("61", "1", R.drawable.zaragoza, "Real Zaragoza","http://www.realzaragoza.com/"));

        //aniadirEntrada2(new Lista_entrada2("0", "0", R.drawable.cavaliersjugador, "Derrick Martell Ros", "http://www.nba.com/cavaliers/"));
        //aniadirEntrada2(new Lista_entrada2("0", "0", R.drawable.lcav, "Lebron James", "Jugador de los Clevelan Cavaliers", "http://www.nba.com/cavaliers/"));

        //aniadirEntrada2(new Lista_entrada2("1", "1", R.drawable.celticjugador, "Drrin Stone", "Jugador de los Boston Celtic","http://www.nba.com/celtics/"));
        //aniadirEntrada2(new Lista_entrada2("1", "1", R.drawable.davidlee, "David Lee", "Jugador de los Celtic ","http://www.nba.com/celtics/"));

        //aniadirEntrada2(new Lista_entrada2("2", "2", R.drawable.chicagojugador, "Kobe Bean Bryant", "Jugador de los Chicago Bulls","http://www.nba.com/lakers/espanol"));
        //aniadirEntrada2(new Lista_entrada2("2", "2", R.drawable.kbull, "Kriys Bryan", "Jugador de los Chicago Bulls","http://www.nba.com/lakers/espanol"));

        //aniadirEntrada2(new Lista_entrada2("3", "3", R.drawable.dallasjugador, "Corey Jae Crowder", "Jugador de los Dallas Maveriks","http://www.mavs.com/"));
        //aniadirEntrada2(new Lista_entrada2("3", "3", R.drawable.dmaveriks, "Daron Lamb", "Jugador de los Dallas Maveriks","http://www.mavs.com/"));

        //aniadirEntrada2(new Lista_entrada2("4", "4", R.drawable.houstonjugador, "Dwight David Howard","Jugador de los Houston Rockets","http://www.nba.com/rockets/"));
        //aniadirEntrada2(new Lista_entrada2("4", "4", R.drawable.jhouston, "jeremy lin ","Jugador de los Houston Rockets","http://www.nba.com/rockets/"));

        //aniadirEntrada2(new Lista_entrada2("5", "5", R.drawable.kignsjugador, "Monta Ellis", "Jugador de los Sacramento Kings","http://www.nba.com/kings/voteproud"));
        //aniadirEntrada2(new Lista_entrada2("5", "5", R.drawable.cakings, "Caron Butler", "Jugador de los Sacramento Kings","http://www.nba.com/kings/voteproud"));

        //aniadirEntrada2(new Lista_entrada2("6", "6", R.drawable.lakersjugador, "Kobe Bean Bryant", "Jugador de los Angeles Lakers ","http://www.nba.com/lakers/espanol"));
        //aniadirEntrada2(new Lista_entrada2("6", "6", R.drawable.nlakers, "Nick Young", "Jugador de los Angeles Lakers ","http://www.nba.com/lakers/espanol"));

        //aniadirEntrada2(new Lista_entrada2("7", "7", R.drawable.raptorsjugador, "Darren Michael Collison", "Jugador de los Toronto Raptors","http://www.nba.com/spurs/?tmd=1"));
        //aniadirEntrada2(new Lista_entrada2("7", "7", R.drawable.leraptors, "Louis Williams", "Jugador de los Toronto Raptors","http://www.nba.com/spurs/?tmd=1"));

        //aniadirEntrada2(new Lista_entrada2("8", "8", R.drawable.spursjugador, "Carlos Martinez","Jugador de los San Antonio Spurs","http://www.nba.com/raptors/"));
        //aniadirEntrada2(new Lista_entrada2("8", "8", R.drawable.mspurs, "Manu Ginobili","Jugador de los San Antonio Spurs","http://www.nba.com/raptors/"));



    }
    private static void aniadirEntrada(Lista_entrada entrada) {
        ENTRADAS_LISTA.add(entrada);
        ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
    }

    private static void aniadirEntrada2(Lista_entrada2 entrada) {
        ENTRADAS_LISTA2.add(entrada);
        ENTRADAS_LISTA_HASHMAP2.put(entrada.id, entrada);
    }

    public static class Lista_entrada {
        public String id;
        public int idImagen;
        public String texto;

        public Lista_entrada (String id, int idImagen, String textoEncima) {
            this.id = id;
            this.idImagen = idImagen;
            this.texto = textoEncima;
        }
    }

    public static class Lista_entrada2 {
        public String id;
        public String pais;
        public int idImagen;
        public String texto;
        public String web;

        public String getPais(){
            return this.pais;
    }

        public Lista_entrada2 (String id, String pais, int idImagen, String textoEncima, String web) {
            this.id = id;
            this.pais=pais;
            this.idImagen = idImagen;
            this.texto = textoEncima;
            this.web = web;
        }
        public String getWeb(){
            return this.web;
        }
    }
}
