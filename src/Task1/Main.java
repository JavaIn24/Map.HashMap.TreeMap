package Task1;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> towns = new HashMap<>();
        towns.put(1, "Москва");
        towns.put(2, "Самара");
        towns.put(3, "Тюмень");
        towns.put(4, "Екатеринбург");
        System.out.println(keyHashMapTowns(towns));

    }
    public static Collection<Integer> keyHashMapTowns(HashMap<Integer, String> mapExamp){
        Collection<Integer> key = mapExamp.keySet();
        return key;
    }
}
