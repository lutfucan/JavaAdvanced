
public class Test {
    
    public static void main(String[] args) {
        
        Giyim deriMont = GiyimCache.create("Deri Ceket");
        Giyim ceket = GiyimCache.create("Kumaş Ceket");
        Giyim beyazGomlek = GiyimCache.create("Beyaz Gömlek");
        Giyim gomlek = GiyimCache.create("Renkli Gömlek");
        
        deriMont.show();
        ceket.show();
        beyazGomlek.show();
        gomlek.show();
        
    }

}
