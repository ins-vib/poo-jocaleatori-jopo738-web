package com.jocaleatori;

public class Jugador {
    String nom;
    int punts=0;

    int comptadorJugadors;

    public void Jugador(String nom){

    }

    public void Jugador(){

    }

    public String getNom() {
        return nom;
    }

    public int getPunts() {
        return punts;
    }


    public int afegirPunts(int punts){
       int puntuaciofinal= punts+punts;
       return puntuaciofinal;
    }




}
