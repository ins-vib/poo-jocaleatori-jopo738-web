package com.jocaleatori;

import java.util.ArrayList;

public class Joc {
    private MaquinaAleatoria maquinaAleatoria;
    int NUM_TIREADES;
    int NUM_MAX_RONDES;
    ArrayList<Jugador>jugadors;


    public Joc(MaquinaAleatoria maquinaAleatoria){
        this.maquinaAleatoria=maquinaAleatoria;
    }

    public void prova(){

        int numero= maquinaAleatoria.llençar();

    }

    public void afegirJugador(String nom){
        if (nom==null|| nom.isEmpty()){
            jugadors.add(new Jugador());
        }else{
            jugadors.add(new Jugador(nom));
        }

    }

    public void jugarRonda(int numRonda){

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

        return true;


    }

    public String obtenirGuanyador(){
        
    }
}
