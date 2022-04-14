package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List <Car> list = new ArrayList(){{
            add(new Car("Лада", "Седан"));
            add(new Car("Лада", "хэтчбек "));
            add(new Car("Мерседес", "седан "));
            add(new Car("Бмв", "кроссовер"));
            add(new Car("Форд", "Хэтчбек"));
            add(new Car("Пежо", "кроссовер "));
            add(new Car("Тойота", "седан"));
        }};

        Map <String, ArrayList<Car>> map = new HashMap();

        defineModel(list, map);

        map.entrySet().iterator().forEachRemaining(System.out::println);

    }

    static void defineModel(List<Car> list, Map <String, ArrayList<Car>> map) {

        ArrayList<Car> listSedan = new ArrayList<>();
        ArrayList<Car> listCrossover = new ArrayList<>();
        ArrayList<Car> listHatchback = new ArrayList<>();

        Iterator <Car> iterator = list.iterator();

        while (iterator.hasNext()) {

            Car car = iterator.next();
            String type = car.getType().replaceAll("\\s","").toLowerCase();

            switch (type) {
                case "седан":
                    listSedan.add(car);
                    break;
                case "кроссовер":
                    listCrossover.add(car);
                    break;
                case "хэтчбек":
                    listHatchback.add(car);
                    break;
                default:
                    break;
            }

        }

        map.put("седан", listSedan);
        map.put("кроссовер", listCrossover);
        map.put("хэтчбек", listHatchback);

    }
}
