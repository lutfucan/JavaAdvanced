
import java.util.HashMap;
import java.util.Map;


public class Country {
    
    private String countryName;
    private long population;
    //Map kullanmamızın nedeni, aynı key'den sadece bir tane bulunmasıdır.
    private static Map<String,Country> countries = new HashMap<>();
    
    private Country(){
    }
    
    //Burada aynı isimde sadece bir tane ülke olması sağlanıyor.
    public static Country getCountry(String countryName){
        if(!countries.containsKey(countryName)){
            Country country = new Country();
            country.setCountryName(countryName);
            countries.put(countryName, country);
        }
        return countries.get(countryName);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
    
    

}
