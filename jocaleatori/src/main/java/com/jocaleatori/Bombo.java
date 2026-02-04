package com.jocaleatori;

import java.util.ArrayList;
import java.util.Random;

public class Bombo implements MaquinaAleatoria {
     private ArrayList<Integer>bombos;
    

    

    public Bombo(ArrayList<Integer> bombos) {
        this.bombos = bombos;
    }

    @Override
    public int llençar() {
        if(bombos.isEmpty()){    // aixo ens diu que si bombos és 0 doni un error
            throw new IllegalStateException("ERROR ja no queden boles");
        }

        Random random= new Random();
        int aleatori=random.nextInt(bombos.size());       
        return bombos.remove(aleatori);  //elimina bola perque no es repeteixi

        
    }


}
