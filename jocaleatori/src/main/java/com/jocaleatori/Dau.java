package com.jocaleatori;

import java.util.Random;

public class Dau implements MaquinaAleatoria {   //amb el implements maquinaAleatoria, estem dient que tots els metodes que tingui a la interficie els ha d'implementar
    public int nombredecares;

    public Dau(int nombredecares) {
        this.nombredecares = nombredecares;
    }


    @Override
    public int llençar(){
        Random random= new Random();
        int numero= random.nextInt(1,(this.nombredecares+1));
        return numero;
    }



    public int getNombredecares() {
        return nombredecares;
    }



    public void setNombredecares(int nombredecares) {
        this.nombredecares = nombredecares;
    }


}
