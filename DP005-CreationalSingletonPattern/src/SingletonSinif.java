
public class SingletonSinif {
    
    private static SingletonSinif singletonOrnek = new SingletonSinif();
   
    private SingletonSinif() {
    }
    
    public static SingletonSinif getSinif() {
        return singletonOrnek;
    }
}
