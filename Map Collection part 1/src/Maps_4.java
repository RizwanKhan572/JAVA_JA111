import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Maps_4 {
    public static void main(String[] args) {

        Map<String,Double> countryToPopulation =new LinkedHashMap<>();
        countryToPopulation.put("India",1.3);
        countryToPopulation.put("China", 1.4);
        countryToPopulation.put("USA",0.4);
        System.out.println(countryToPopulation);
    }
    // HashMap = unordered
    // LinkedHashMap = ordered

}
