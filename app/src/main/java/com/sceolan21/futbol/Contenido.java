package com.sceolan21.futbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contenido {
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();
    public static ArrayList<Lista_entrada2> ENTRADAS_LISTA2 = new ArrayList<Lista_entrada2>();
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();
    public static Map<String, Lista_entrada2> ENTRADAS_LISTA_HASHMAP2 = new HashMap<String, Lista_entrada2>();

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

        aniadirEntrada2(new Lista_entrada2("42", "2", R.drawable.afcbournemouth, "AFC Bournemouth","http://www.afcb.co.uk/"));
        aniadirEntrada2(new Lista_entrada2("43", "2", R.drawable.arsenal, "Arsenal","http://www.arsenal.com/home"));
        aniadirEntrada2(new Lista_entrada2("44", "2", R.drawable.burnley, "Burnely FC","http://www.burnleyfootballclub.com/"));
        aniadirEntrada2(new Lista_entrada2("45", "2", R.drawable.chelsea, "Chelsea FC","https://www.chelseafc.com/"));
        aniadirEntrada2(new Lista_entrada2("46", "2", R.drawable.crystalpalace, "Crystal Palace FC","http://www.cpfc.co.uk/"));
        aniadirEntrada2(new Lista_entrada2("47", "2", R.drawable.everton, "Everton","http://www.evertonfc.com/home"));
        aniadirEntrada2(new Lista_entrada2("48", "2", R.drawable.hullcity, "Hull City","http://www.hullcitytigers.com/"));
        aniadirEntrada2(new Lista_entrada2("49", "2", R.drawable.leicester, "Leicester City FC","http://www.lcfc.com/"));
        aniadirEntrada2(new Lista_entrada2("50", "2", R.drawable.liverpool, "Liverpool FC","http://www.liverpoolfc.com/welcome-to-liverpool-fc"));
        aniadirEntrada2(new Lista_entrada2("51", "2", R.drawable.manchestercity, "Manchester City","https://www.mancity.com/"));
        aniadirEntrada2(new Lista_entrada2("52", "2", R.drawable.manchesterunited, "Manchester United","http://www.espanol.manutd.com/"));
        aniadirEntrada2(new Lista_entrada2("53", "2", R.drawable.middlesbrough, "Middlesbrough FC","http://www.mfc.co.uk/"));
        aniadirEntrada2(new Lista_entrada2("54", "2", R.drawable.southampton, "Southampton FC","https://southamptonfc.com/"));
        aniadirEntrada2(new Lista_entrada2("55", "2", R.drawable.stoke, "Stoke City","http://www.stokecityfc.com/"));
        aniadirEntrada2(new Lista_entrada2("56", "2", R.drawable.sunderland, "Sunderland FC","https://www.safc.com/"));
        aniadirEntrada2(new Lista_entrada2("57", "2", R.drawable.swansea, "Swansea City","http://www.swanseacity.net/"));
        aniadirEntrada2(new Lista_entrada2("58", "2", R.drawable.tottenham, "Tottenham Hotspurs","http://www.tottenhamhotspur.com/"));
        aniadirEntrada2(new Lista_entrada2("59", "2", R.drawable.watford, "Watford","https://www.watfordfc.com/"));
        aniadirEntrada2(new Lista_entrada2("60", "2", R.drawable.wba, "West Bromwich Albion","http://www.wba.co.uk/"));
        aniadirEntrada2(new Lista_entrada2("61", "2", R.drawable.westham, "West Ham United","https://www.whufc.com/"));

        aniadirEntrada2(new Lista_entrada2("62", "3", R.drawable.fckoln, "1 FC Koln","https://www.fc-koeln.de/en/fc-info/home/"));
        aniadirEntrada2(new Lista_entrada2("63", "3", R.drawable.mainz05, "1 FSV Mainz 05","http://www.mainz05.de/mainz05/home.html"));
        aniadirEntrada2(new Lista_entrada2("64", "3", R.drawable.hoffenheim, "1899 Hoffenheim","http://www.achtzehn99.de/"));
        aniadirEntrada2(new Lista_entrada2("65", "3", R.drawable.leverkusen, "Bayer 04 Leverkusen","http://www.bayer04.de/B04-ENG/en/_site_index.aspx"));
        aniadirEntrada2(new Lista_entrada2("66", "3", R.drawable.borussiadortmund, "Borussia Dortmund","http://www.bvb.de/es/"));
        aniadirEntrada2(new Lista_entrada2("67", "3", R.drawable.borussiamonchengladbach, "Borussia Monchengladbach","https://www.borussia.de/espanol/bienvenidos-al-borussia.html"));
        aniadirEntrada2(new Lista_entrada2("68", "3", R.drawable.eintrachtfrankfurt, "Eintracht Frankfurt","https://www.eintracht.de/"));
        aniadirEntrada2(new Lista_entrada2("69", "3", R.drawable.fcaugsburg, "FC Augsburg","http://www.fcaugsburg.de/"));
        aniadirEntrada2(new Lista_entrada2("70", "3", R.drawable.fcbayernmunchen, "FC Bayern München","https://fcbayern.com/es"));
        aniadirEntrada2(new Lista_entrada2("71", "3", R.drawable.fcingolstadt04, "FC Ingolstadt 04","http://www.fcingolstadt.de/home/"));
        aniadirEntrada2(new Lista_entrada2("72", "3", R.drawable.hamburger, "Hamburger SV","https://www.hsv.de/uebersicht/"));
        aniadirEntrada2(new Lista_entrada2("73", "3", R.drawable.hertha, "Hertha BSC","http://www.herthabsc.de/en/"));
        aniadirEntrada2(new Lista_entrada2("74", "3", R.drawable.rbleipzig, "RB Leipzig","http://www.dierotenbullen.com/"));
        aniadirEntrada2(new Lista_entrada2("75", "3", R.drawable.schalke04, "Schalke 04","http://www.schalke04.de/en/"));
        aniadirEntrada2(new Lista_entrada2("76", "3", R.drawable.scfreiburg, "Sport Club Freiburg","https://www.scfreiburg.com/"));
        aniadirEntrada2(new Lista_entrada2("77", "3", R.drawable.svdarmstadt98, "SV Darmstadt 98","https://sv98.de/"));
        aniadirEntrada2(new Lista_entrada2("78", "3", R.drawable.wolfsburg, "VfL Wolfsburg","https://www.vfl-wolfsburg.de/"));
        aniadirEntrada2(new Lista_entrada2("79", "3", R.drawable.werderbremen, "Werder Bremen","https://www.werder.de/en/"));

        aniadirEntrada2(new Lista_entrada2("80", "4", R.drawable.milan, "AC Milan","https://www.acmilan.com/en"));
        aniadirEntrada2(new Lista_entrada2("81", "4", R.drawable.roma, "AS Roma","http://www.asroma.com/en"));
        aniadirEntrada2(new Lista_entrada2("82", "4", R.drawable.atalanta, "Atalanta Bergamasca Calcio","https://www.atalanta.it/"));
        aniadirEntrada2(new Lista_entrada2("83", "4", R.drawable.bologna, "Bologna FC","https://www.bolognafc.it/"));
        aniadirEntrada2(new Lista_entrada2("84", "4", R.drawable.cagliari, "Cagliari Calcio","http://www.cagliaricalcio.com/"));
        aniadirEntrada2(new Lista_entrada2("85", "4", R.drawable.chievo, "Chievo Verona","http://www.chievoverona.it/"));
        aniadirEntrada2(new Lista_entrada2("86", "4", R.drawable.empoli, "Empoli FC","http://www.empolicalcio.it/"));
        aniadirEntrada2(new Lista_entrada2("87", "4", R.drawable.crotone, "FC Crotone","http://www.fccrotone.it/"));
        aniadirEntrada2(new Lista_entrada2("88", "4", R.drawable.inter, "FC Internazionale","http://www.inter.it/es/hp"));
        aniadirEntrada2(new Lista_entrada2("89", "4", R.drawable.fiorentina, "Fiorentina","http://en.violachannel.tv/"));
        aniadirEntrada2(new Lista_entrada2("90", "4", R.drawable.genoa, "Genoa","http://genoacfc.it/"));
        aniadirEntrada2(new Lista_entrada2("91", "4", R.drawable.juventus, "Juventus FC","http://www.juventus.com/es/"));
        aniadirEntrada2(new Lista_entrada2("92", "4", R.drawable.napoli, "Napoli","http://www.sscnapoli.it/static/default/Home-213.aspx?lingua=es-ES"));
        aniadirEntrada2(new Lista_entrada2("93", "4", R.drawable.pescara, "Pescara Calcio","https://www.pescaracalcio.com/"));
        aniadirEntrada2(new Lista_entrada2("94", "4", R.drawable.sampdoria, "Sampdoria","http://www.sampdoria.it/home-page/"));
        aniadirEntrada2(new Lista_entrada2("95", "4", R.drawable.lazio, "SS Lazio","http://www.sslazio.it/it/"));
        aniadirEntrada2(new Lista_entrada2("96", "4", R.drawable.torino, "Torino FC","http://torinofc.it/"));
        aniadirEntrada2(new Lista_entrada2("97", "4", R.drawable.udinese, "Udinese Calcio","http://www.udinese.it/"));
        aniadirEntrada2(new Lista_entrada2("98", "4", R.drawable.palermo, "US Citta di Palermo","http://palermocalcio.it/en/"));
        aniadirEntrada2(new Lista_entrada2("99", "4", R.drawable.sassuolo, "US Sassuolo","http://www.sassuolocalcio.it/"));
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
