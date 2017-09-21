
public class SingletonZorlama {
    
    private static SingletonZorlama ornek = null;
    
    private SingletonZorlama(){
    }

    public static SingletonZorlama getOrnek() {
        if(ornek == null)
            return new SingletonZorlama();
        else
            return ornek;
    }
}
