package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Жигули");
        cars.put(2, "ВАЗ");
        cars.put(3, "Пятнашка");
        cars.put(4, "Запорожец");
        System.out.println(sortCars(cars));
    }


    public static Map<Integer,String>   sortCars(Map<Integer, String> mapExamp) {
        Map< Integer,String> mapCar = new HashMap<>();
        for (Map.Entry <Integer,String> sortCar : mapExamp.entrySet()) {
            if (sortCar.getValue().toString().length() > 3){
                mapCar.put(sortCar.getKey(), sortCar.getValue());

            }
        }
        return mapCar;
    }
}
