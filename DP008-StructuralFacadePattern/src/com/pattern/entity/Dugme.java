package com.pattern.entity;

public class Dugme {
    
    private double aci;

    public Dugme(double aci) {
        this.aci = aci;
    }

    public double getAci() {
        return aci;
    }

    public void setAci(double aci) {
        this.aci = aci;
    }
    
    public void show(){
        System.out.println("Açı " + aci);
    }

}
