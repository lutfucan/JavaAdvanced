package com.pattern.entity;


public class Govde {

    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Govde(String isim) {
        this.isim = isim;
    }

    public void show() {
        System.out.println("Gövde " + isim);
    }

}
