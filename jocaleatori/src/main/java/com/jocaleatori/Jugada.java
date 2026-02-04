package com.jocaleatori;

public class Jugada {
    int[]resultats;

    public void Jugada(MaquinaAleatoria maquinaAleatoria, int numeroTirades){

    }

    public int[] getJugada() {
        return resultats;
    }


    public boolean esGuanyadordirecte(){
        for(int i =0; i>=0; i++){
            if(resultats[i]!=resultats[0]){
                return false;
            }

        }
        return true;

    }

    public boolean mortDirecte(){

        for(int i=0; i>=0; i++){
            
        }
    return true;

    }

    public int obtenirpuntuacio(){
        
        int puntuacio=0;
        for(int punts: resultats){
            puntuacio=punts+puntuacio;
        }
        return puntuacio;

    }

    public boolean esValida(){

        return resultats!=null && resultats.length>0;

    }

    

    

    

    
}
