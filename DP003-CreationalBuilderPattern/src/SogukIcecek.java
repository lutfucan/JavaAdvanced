
public abstract class SogukIcecek implements Urun {

    @Override
    public abstract float fiyat();

    @Override
    public Paketleme paketleme(){
        return new Şişe();
    }   
    

}
