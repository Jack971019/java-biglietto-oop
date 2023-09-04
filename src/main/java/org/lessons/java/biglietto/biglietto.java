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
        this.km = km;
        this.passengerAge = passengerAge;
    }


    // GETTER AND SETTER

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }


    // METODI


}
