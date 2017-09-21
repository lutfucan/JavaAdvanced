
public class Test {
    
    public static void main(String[] args) {
        
        SingletonSinif sinifOrnegi = SingletonSinif.getSinif();
        
        System.out.println("Sınıfın yaratılan örneği her yaratımda "
                + "aynı referansı gösterir : "
                + sinifOrnegi);
        
        SingletonSinif sinifOrnegi2 = SingletonSinif.getSinif();        
               
        System.out.println("Sınıfın tek nesnesi yaratıldı, yaratılan diğer"
                + "nesnelerin değerleri de ilk yaratılan nesne ile aynı olur : "
                + sinifOrnegi2);

        
        System.out.println("-----------------------------------------");
        
        SingletonZorlama zorlama1 = SingletonZorlama.getOrnek();
        
        SingletonZorlama zorlama2 = SingletonZorlama.getOrnek();
        
        System.out.println(zorlama1 + " " + zorlama2);
    }

}
