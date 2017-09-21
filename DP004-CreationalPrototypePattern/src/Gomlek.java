
public class Gomlek implements Giyim{

    private String turu;

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }
    
    @Override
    public void show() {
        System.out.println("Gömlek : " + turu);
    }

    @Override
    public Giyim copy() {
        Gomlek gomlek = new Gomlek();
        gomlek.turu = turu;
        return gomlek;
    }

}
