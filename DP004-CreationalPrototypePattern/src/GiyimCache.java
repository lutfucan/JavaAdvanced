
import java.util.HashMap;
import java.util.Map;


public class GiyimCache {
    
    private final static Map<String,Giyim> PROTOTIP = new HashMap<>();
    
    static{
        Ceket deriCeket = new Ceket();
        deriCeket.setCeketAdi("Deri Ceket");
        Ceket kumasCeket = new Ceket();
        kumasCeket.setCeketAdi("Kumaş Ceket");
        PROTOTIP.put("Deri Ceket", deriCeket);
        PROTOTIP.put("Kumaş Ceket", kumasCeket);
        
        Gomlek beyazGomlek = new Gomlek();
        beyazGomlek.setTuru("Beyaz Gömlek");
        Gomlek renkliGomlek = new Gomlek();
        renkliGomlek.setTuru("Renkli Gömlek");
        PROTOTIP.put("Beyaz Gömlek", beyazGomlek);
        PROTOTIP.put("Renkli Gömlek", renkliGomlek);
    }
    
    public static Giyim create(String key){
        Giyim giyim = PROTOTIP.get(key);
        return giyim.copy();
    }

}
