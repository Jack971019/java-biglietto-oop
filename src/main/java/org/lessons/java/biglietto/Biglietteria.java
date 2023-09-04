package org.lessons.java.biglietto;

import java.util.Scanner;

public class Biglietteria {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Biglietto biglietto = null;

        boolean isValid = false;

        while (!isValid) {
            System.out.println("inserisci il numero di chilometri che vuoi percorrere");
            int km = Integer.parseInt(scan.nextLine());
            System.out.println("inserisci età del passeggero");
            int passengerAge = Integer.parseInt(scan.nextLine());

            try {
                biglietto = new Biglietto(km, passengerAge);
                isValid = true;
            } catch (RuntimeException e) {
                System.out.println("inserire dei dati validi: età del passeggero e chilometri che si vogliono percorrere non possono essere negativi");
            }

        }
        System.out.println("il prezzo del tuo biglietto è:" + biglietto.prezzoFinale() + "€");
    }
}
