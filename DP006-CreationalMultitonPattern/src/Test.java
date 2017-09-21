
public class Test {
    public static void main(String[] args) {
        Country country1 = Country.getCountry("Türkiye");
        country1.setPopulation(75_000_000);
        
        Country country2 = Country.getCountry("Fransa");
        country2.setPopulation(42_000_000);
        
        System.out.println("Ülke1 : " + country1.getCountryName() +
                " - Nüfusu : " + country1.getPopulation() + "Hash : " + country1);
        
        
        System.out.println("Ülke2 : " + country2.getCountryName() +
                " - Nüfusu : " + country2.getPopulation() + "Hash : " + country2);
        
        //Türkiye adında tek ülke olduğu için, aynı countryName'e sahip başka bir
        //ülke de yaratsak aynı nesneyi yaratır.
        Country country3 = Country.getCountry("Türkiye");
        
        
        System.out.println("Ülke : " + country3.getCountryName() +
                " - Nüfusu : " + country3.getPopulation() + "Hash : " + country3);
    }

}
