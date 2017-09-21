public abstract class Burger implements Urun {

    @Override
    public abstract float fiyat();

    @Override
    public Paketleme paketleme(){
        return new Sarım();
    }
    
    

}
