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

    }

    public void jugarRonda(int numRonda){

    }

    public int numJugadorsActius(){

    }

    public boolean jocAcabat(){

    }

    public String obtenirGuanyador(){
        
    }
}
