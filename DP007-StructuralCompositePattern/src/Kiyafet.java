import java.util.ArrayList;
import java.util.List;

public class Kiyafet implements Giyim{

    private String turu;
    //Sınıfın alt parçaları da bu sınıfın türediği türden.
    private List<Giyim> parcalar = new ArrayList<>();

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    public List<Giyim> getParcalar() {
        return parcalar;
    }

    public void setParcalar(List<Giyim> parcalar) {
        this.parcalar = parcalar;
    }
    
    @Override
    public void show() {
        System.out.println("Türü : " + turu);
        for(Giyim giyim : parcalar){
            giyim.show();
        }
        System.out.println("Toplam parça sayısı : " + parcalar.size());
    }

}
