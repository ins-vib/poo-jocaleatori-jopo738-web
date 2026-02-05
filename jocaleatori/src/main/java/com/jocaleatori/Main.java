package com.jocaleatori;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    //     //Dau dau= new Dau(20);
    //     MaquinaAleatoria dau= new Dau(20); // podem posar maquinaaleatoria on hi ha dau aixo es possible ja que hem posat l'interficie
    //    // System.out.println("nombre de cares: "+dau.getNombredecares());
    //     System.out.println("ha soritit la cara: "+ dau.llençar());


    //     System.out.println("-----------------------------------------------------");

    //     int[]valorspossiblesmain={1, 2, 2, 3, 4, 4, 5, 6, 6, 6};



    // //Ruleta ruleta= new Ruleta(valorspossiblesmain);
    // MaquinaAleatoria ruleta= new Ruleta(valorspossiblesmain);

    //     System.out.println("valor de la ruleta: "+ruleta.llençar());


    //      System.out.println("-----------------------------------------------------");

    //      ArrayList<Integer> numerosinicials = new ArrayList<>();

    //      for (int i = 0; i < 10; i++){
    //          numerosinicials.add(i);
    //      }

    //      //Bombo bomboloteria= new Bombo(numerosinicials);
    //      MaquinaAleatoria bomboloteria= new Bombo(numerosinicials);

    //      for (int i=0; i<11; i++){
    //         int bola= bomboloteria.llençar();
    //         System.out.println("ha sortit la bola: "+bola);
    //      }


    //      Joc oca= new Joc(dau);  // aquest joc jugarà amb un dau si vulguessim amb ruleta=  Joc oca= new Joc(ruleta);


    Scanner teclat = new Scanner(System.in);

    // Creació de màquines aleatòries
    MaquinaAleatoria dau = new Dau(6);
    

    // Creació del joc (màquina, número de tirades, número màxim de rondes)
    Joc joc1 = new Joc(dau, 3, 2);
    

    // Afegir jugadors
    joc1.afegirJugador("Ana");
    joc1.afegirJugador("Manel");
    joc1.afegirJugador("Sara");

    System.out.println("Jugadors actius: " + joc1.numJugadorsActius());

    // Bucle principal del joc
    while (!joc1.jocAcabat()) {
        String resultat = joc1.jugarRonda();
        System.out.println(resultat);

        System.out.println("Prem una tecla per continuar...");
        teclat.nextLine();
    }

    // Mostrar guanyador o guanyadors
    System.out.println(joc1.obtenirGuanyador());
}








        
        





        

    
    
}
