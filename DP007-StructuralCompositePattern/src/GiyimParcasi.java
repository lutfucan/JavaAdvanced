public class GiyimParcasi implements Giyim {

    private String parcaAdi;

    public String getParcaAdi() {
        return parcaAdi;
    }

    public void setParcaAdi(String parcaAdi) {
        this.parcaAdi = parcaAdi;
    }
    
    @Override
    public void show() {
        System.out.println("Parça adı : " + parcaAdi);
        
    }

}
