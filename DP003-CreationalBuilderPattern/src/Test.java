
public class Test {
    
    public static void main(String[] args) {
        SiparisBuilder builder = new SiparisBuilder();
        
        Sipariş veganSipariş = builder.createVeganSiparişi();
        System.out.println("Vegan Sipariş : ");
        System.out.println("-------------------------");
        veganSipariş.siparisiGoster();
        
        System.out.println("");
        
        Sipariş tavukSipariş = builder.createTavukSiparişi();
        System.out.println("Tavuk Sipariş : ");
        System.out.println("-------------------------");
        tavukSipariş.siparisiGoster();
        
    }
            

}
