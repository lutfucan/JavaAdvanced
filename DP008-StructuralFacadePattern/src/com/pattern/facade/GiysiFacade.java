package com.pattern.facade;

import com.pattern.entity.Dugme;
import com.pattern.entity.Govde;
import com.pattern.entity.Kenar;

public class GiysiFacade {

    private Govde govde;
    private Kenar kenar;
    private Dugme[] dugmeler;

    public GiysiFacade(String govdeAdi, String kenarTipi, int dugmeSayisi, double dugmeAcisi) {

        govde = new Govde(govdeAdi);
        kenar = new Kenar(kenarTipi);
        dugmeler = new Dugme[dugmeSayisi];
        for (int i = 0; i < dugmeler.length; i++) {
            dugmeler[i] = new Dugme(dugmeAcisi);
        }
    }

    public void show() {
        govde.show();
        kenar.show();
        for(Dugme dugme:dugmeler){
            dugme.show();
        }
        
    }

}
