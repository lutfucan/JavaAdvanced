import java.util.ArrayList;
import java.util.List;


public class Sipariş {
    private List<Urun> urunler = new ArrayList<>();
    
    public void addUrun(Urun urun){
        urunler.add(urun);
    }
    
    public float getMaliyet() {
        float maliyet = 0.0f;
        
        for(Urun urun : urunler){
            maliyet+=urun.fiyat();
        }
        
        return maliyet;
    }

    public void siparisiGoster(){
        for(Urun urun : urunler){
            System.out.print("Ürün : " + urun.isim());
            System.out.print(", Paketleme : " + urun.paketleme().paketle());
            System.out.println(", Fiyat : " + urun.fiyat());
        }
    }
    
}
