package org.lessons.java.biglietto;

import java.math.BigDecimal;

public class Biglietto {


    // ATTRIBUTI

    private int km;

    private int passengerAge;

    final BigDecimal costoPerChilometro = BigDecimal.valueOf(0.21);
    final BigDecimal scontoOver65 =BigDecimal.valueOf(0.6);
    final BigDecimal scontoUnder18 = BigDecimal.valueOf(0.8);



    // COSTRUTTORI

    public Biglietto(int km, int passengerAge) {
        if (km < 0){
            throw new RuntimeException();
        }
        this.km = km;
       if (passengerAge < 0){
           throw new RuntimeException();
       }
        this.passengerAge = passengerAge;
    }


    // GETTER AND SETTER

    public int getKm() {
        if (km < 0){
            throw new RuntimeException();
        }
        return km;
    }

    public void setKm(int km) {
        if (km < 0){
            throw new RuntimeException();
        }
        this.km = km;
    }

    public int getPassengerAge() {
        if (passengerAge < 0){
            throw new RuntimeException();
        }
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        if (passengerAge < 0){
            throw new RuntimeException();
        }
        this.passengerAge = passengerAge;
    }


    // METODI

    private void validkm(int km){
        if(km < 0) {
            throw new RuntimeException();
        }
    }


    // calcolare prezzo finale con lo sconto

    public BigDecimal prezzoFinale(){
        BigDecimal prezzo = costoPerChilometro.multiply(BigDecimal.valueOf(km));
        return prezzo.multiply(sconto());
    }

    // calcolare lo sconto

    private BigDecimal sconto(){
        BigDecimal sconto = BigDecimal.valueOf(1);
        if (passengerAge < 18){
            sconto = scontoUnder18;
        } else if (passengerAge > 65 ) {
            sconto = scontoOver65;
        }
        return sconto;
    }


}
