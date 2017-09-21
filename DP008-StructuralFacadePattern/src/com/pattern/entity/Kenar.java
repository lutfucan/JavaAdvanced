package com.pattern.entity;

public class Kenar {
    
    private String tip;

    public Kenar(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    
    public void show(){
        System.out.println("Kenar " + tip);
    }

}
