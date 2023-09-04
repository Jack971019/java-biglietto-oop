package org.lessons.java.biglietto;

import java.math.BigDecimal;

public class biglietto {

    // ATTRIBUTI

    private int km;

    private int passengerAge;

    final BigDecimal costoPerChilometro = new BigDecimal("0,21");
    final BigDecimal scontoOver65 = new BigDecimal("0,40");
    final BigDecimal scontoUnder18 = new BigDecimal("0,20");



    // COSTRUTTORI

    public biglietto(int km, int passengerAge) {
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

    private BigDecimal prezzoFinale(){
        BigDecimal prezzo = BigDecimal.ZERO;
        if(passengerAge > 65){
            prezzo = costoPerChilometro.multiply(new BigDecimal(km)).multiply(scontoOver65);
        } else if(passengerAge < 18){
            prezzo = costoPerChilometro.multiply(new BigDecimal(km)).multiply(scontoUnder18);
        } else {
            prezzo = costoPerChilometro.multiply(new BigDecimal(km));
        }
        return prezzo;
    }


}
