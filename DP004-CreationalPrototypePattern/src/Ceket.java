
public class Ceket implements Giyim{
    
    private String ceketAdi;

    public String getCeketAdi() {
        return ceketAdi;
    }

    public void setCeketAdi(String ceketAdi) {
        this.ceketAdi = ceketAdi;
    }

    @Override
    public void show() {
        System.out.println("Ceket adı : " + ceketAdi);
    }

    @Override
    public Giyim copy() {
        Ceket ceket = new Ceket();
        ceket.ceketAdi = ceketAdi;
        return ceket;
    }

}
