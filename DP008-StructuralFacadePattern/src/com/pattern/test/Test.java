package com.pattern.test;

import com.pattern.facade.GiysiFacade;

public class Test {
    
    //Alt sınıfların hiç biriyle uğraşmadan, facade (önyüz) sınıfı ile tüm bilgiler aktarılabiliyor.+9-9****9*********** 
    public static void main(String[] args) {
        
        GiysiFacade facade = new GiysiFacade("Kumaş", "Düz", 3, 360);
        facade.show();
    }

}
