package com.jocaleatori;

public class Jugada {
    int[]resultats;

    public Jugada(MaquinaAleatoria maquinaAleatoria, int numeroTirades){

        this.resultats= new int[numeroTirades];
        for(int i =0; i<numeroTirades;i++){
            this.resultats[i]=maquinaAleatoria.llençar();
        }

    }

    public int[] getJugada() {
        return resultats;
    }


    public boolean esGuanyadordirecte(){
        for(int i =1; i<resultats.length; i++){
            if(resultats[i]!=resultats[0]){
                return false;
            }

        }
        return true;

    }

    public boolean mortDirecte(){

        for(int i=0; i>=resultats.length; i++){
            int valor=resultats[i];
            int posicio= i+1;
            if(posicio%2 != 0 && valor % 2 ==0){
                return false;
            }
            if(posicio%2==0 && valor %2 != 0){
                return false;
            }
           
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

    @Override
    public String toString(){
        String text="";
        for(int i=0;i<resultats.length;i++){
            text=text+resultats[i];
            if(i<resultats.length-1){
                text=text+" ";
            }
        }
        return text;
    }

    

    

    

    
}
