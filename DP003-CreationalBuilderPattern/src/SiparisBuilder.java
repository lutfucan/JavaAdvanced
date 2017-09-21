
public class SiparisBuilder {
    
    public Sipariş createVeganSiparişi(){
        Sipariş sipariş = new Sipariş();
        sipariş.addUrun(new VeganBurger());
        sipariş.addUrun(new Ayran());
        
        return sipariş;
    }

    public Sipariş createTavukSiparişi(){
        Sipariş sipariş = new Sipariş();
        sipariş.addUrun(new TavukBurger());
        sipariş.addUrun(new Kola());
        
        return sipariş;
    }
}
