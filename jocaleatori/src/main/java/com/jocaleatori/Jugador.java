package com.jocaleatori;

public class Jugador {
    String nom;
    int punts=0;

    int comptadorJugadors;

    public  Jugador(String nom){

        this.nom=nom;
        this.punts=0;
        comptadorJugadors++;

    }

    public  Jugador(){
        comptadorJugadors++;
        this.nom= "Jugador"+comptadorJugadors;
        this.punts=0;

    }

    public String getNom() {
        return nom;
    }

    public int getPunts() {
        return punts;
    }


    public int afegirPunts(int punts){
       this.punts=this.punts+punts;
       return this.punts;
    }


    //extra
    public void setEliminat(){
        this.punts=-1;
    }




}
