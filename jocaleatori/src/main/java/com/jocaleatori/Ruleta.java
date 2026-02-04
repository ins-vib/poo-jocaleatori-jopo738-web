package com.jocaleatori;

import java.util.Random;

public class Ruleta implements MaquinaAleatoria {    //posem el implements (explicacio a dau)
    private int[] valorspossibles;

    public Ruleta(int[] valorspossibles) {
        this.valorspossibles = valorspossibles;
        
    }


    @Override
    public int llençar(){
        Random random= new Random();
        int numero= random.nextInt(0,(valorspossibles.length+1));
        return valorspossibles[numero];

    }






    
}
