
public class Test {

    public static void main(String[] args) {
        
        GiyimParcasi yaka = new GiyimParcasi();
        yaka.setParcaAdi("Yaka");
        
        GiyimParcasi govde = new GiyimParcasi();
        govde.setParcaAdi("Gövde");
        
        GiyimParcasi kol = new GiyimParcasi();
        kol.setParcaAdi("Kol");
        
        Kiyafet gomlek = new Kiyafet();
        gomlek.setTuru("Gömlek");
        gomlek.getParcalar().add(yaka);
        gomlek.getParcalar().add(govde);
        gomlek.getParcalar().add(kol);
        gomlek.show();
        
    }
}
