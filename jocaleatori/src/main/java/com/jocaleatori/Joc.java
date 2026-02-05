package com.jocaleatori;

import java.util.ArrayList;

public class Joc {
    private MaquinaAleatoria maquinaAleatoria;
    int NUM_TIREADES;
    int NUM_MAX_RONDES;
    ArrayList<Jugador>jugadors= new ArrayList<>();
    
    private Jugador guanyadorKO=null;

     private int tornActual=0;
    private int rondaActual=1;
    private boolean partidaFinalitzada=false;
    private String missatgeGuanyadorDirecte="";



    public Joc(MaquinaAleatoria maquinaAleatoria, int numTirades, int maxRondes){
        this.maquinaAleatoria=maquinaAleatoria;
        this.NUM_TIREADES=numTirades;
        this.NUM_MAX_RONDES=maxRondes;

       
    }

   

    public void afegirJugador(String nom){
        if (nom==null|| nom.isEmpty()){
            jugadors.add(new Jugador());
        }else{
            jugadors.add(new Jugador(nom));
        }

    }

    public String jugarRonda(){

        if(jocAcabat()){
            return "El joc s'ha acabat";
        }

        while(jugadors.get(tornActual).getPunts()==-1){
            tornActual++;
            if(jocAcabat()){
                return "El joc s'ha acabat";
            }
        }

        Jugador j= jugadors.get(tornActual);
        Jugada jugada= new Jugada(maquinaAleatoria,NUM_TIREADES);
        String log= "Ronda "+rondaActual+" | " + j.getNom()+ " tira: {"+jugada.toString()+"}";

        if(jugada.esGuanyadordirecte()){
            guanyadorKO=j;
            log= log+"Guanyador directa";
        }else if (jugada.mortDirecte()) {
            j.setEliminat();
            log=log+"Mort directa";
        }else{
            int p=jugada.obtenirpuntuacio();
            j.afegirPunts(p);
            log=log+"suma "+p+" punts (Total: "+ j.getPunts()+")";
        }
        avançarTorn();
        return log;

    }

    private void avançarTorn(){
        tornActual++;
        if(tornActual>=jugadors.size()){
            tornActual=0;
            rondaActual++;
        }
    }

    public int numJugadorsActius(){
        int actius=0;
        for(Jugador j: jugadors){      // mirem a l'array de jugador que tenim a veure quants estan actius
            if(j.getPunts()!=-1){
                actius++;
            }
        }
        return actius;

    }

    public boolean jocAcabat(){

        return guanyadorKO != null || rondaActual>=NUM_MAX_RONDES || numJugadorsActius()<=1;


    }

    public String obtenirGuanyador(){
        if(guanyadorKO != null){
            return "Guanyador Directe: "+guanyadorKO.getNom();
        }

        Jugador guanyador=null;
        for(Jugador j: jugadors){
            if(j.getPunts()!=-1){
                if(guanyador==null|| j.getPunts()>guanyador.getPunts()){
                    guanyador=j;
                }
            }
        }
        if(guanyador!=null){
            return "guanyador: "+guanyador.getNom();
        }else{
            return "ningu";
        }
         
    }
}
