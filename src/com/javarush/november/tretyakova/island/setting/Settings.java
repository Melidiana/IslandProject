package com.javarush.november.tretyakova.island.setting;
import com.javarush.november.tretyakova.island.enumerator.TypeOfAnimal;
import java.util.HashMap;
import java.util.Map;
import static com.javarush.november.tretyakova.island.enumerator.TypeOfAnimal.*;

public class Settings {
    private final Map<TypeOfAnimal, Map<TypeOfAnimal, Integer>> animalToTable = new HashMap<>();

    {
        Map<TypeOfAnimal, Integer> wolfMap = new HashMap<>();
        wolfMap.put(HORSE, 10);
        wolfMap.put(DEER, 15);
        wolfMap.put(RABBIT, 60);
        wolfMap.put(MOUSE, 80);
        wolfMap.put(GOAT, 60);
        wolfMap.put(SHEEP, 70);
        wolfMap.put(BOAR, 15);
        wolfMap.put(BUFFALO, 10);
        wolfMap.put(DUCK, 40);
        wolfMap.put(CATERPILLAR, 0);
        wolfMap.put(PLANT, 0);
        wolfMap.put(BOA, 0);
        wolfMap.put(FOX, 0);
        wolfMap.put(BEAR, 0);
        wolfMap.put(EAGLE, 0);
        animalToTable.put(WOLF, wolfMap);

        Map<TypeOfAnimal, Integer> boaMap = new HashMap<>();
        boaMap.put(HORSE, 0);
        boaMap.put(DEER, 0);
        boaMap.put(RABBIT, 20);
        boaMap.put(MOUSE, 40);
        boaMap.put(GOAT, 0);
        boaMap.put(SHEEP, 0);
        boaMap.put(BOAR, 0);
        boaMap.put(BUFFALO, 0);
        boaMap.put(DUCK, 10);
        boaMap.put(CATERPILLAR, 0);
        boaMap.put(PLANT, 0);
        boaMap.put(WOLF, 0);
        boaMap.put(FOX, 0);
        boaMap.put(BEAR, 0);
        boaMap.put(EAGLE, 0);
        animalToTable.put(BOA, boaMap);

        Map<TypeOfAnimal, Integer> foxMap = new HashMap<>();
        foxMap.put(HORSE, 0);
        foxMap.put(DEER, 0);
        foxMap.put(RABBIT, 70);
        foxMap.put(MOUSE, 90);
        foxMap.put(GOAT, 0);
        foxMap.put(SHEEP, 0);
        foxMap.put(BOAR, 0);
        foxMap.put(BUFFALO, 0);
        foxMap.put(DUCK, 60);
        foxMap.put(CATERPILLAR, 40);
        foxMap.put(PLANT, 0);
        foxMap.put(WOLF, 0);
        foxMap.put(BOA, 0);
        foxMap.put(BEAR, 0);
        foxMap.put(EAGLE, 0);
        animalToTable.put(FOX, foxMap);

        Map<TypeOfAnimal, Integer> bearMap = new HashMap<>();
        bearMap.put(HORSE, 40);
        bearMap.put(DEER, 80);
        bearMap.put(RABBIT, 80);
        bearMap.put(MOUSE, 90);
        bearMap.put(GOAT, 70);
        bearMap.put(SHEEP, 70);
        bearMap.put(BOAR, 50);
        bearMap.put(BUFFALO, 20);
        bearMap.put(DUCK, 10);
        bearMap.put(CATERPILLAR, 0);
        bearMap.put(PLANT, 0);
        bearMap.put(WOLF, 0);
        bearMap.put(BOA, 80);
        bearMap.put(FOX, 0);
        bearMap.put(EAGLE, 0);
        animalToTable.put(BEAR, bearMap);

        Map<TypeOfAnimal, Integer> eagleMap = new HashMap<>();
        eagleMap.put(HORSE, 0);
        eagleMap.put(DEER, 0);
        eagleMap.put(RABBIT, 90);
        eagleMap.put(MOUSE, 90);
        eagleMap.put(GOAT, 0);
        eagleMap.put(SHEEP, 0);
        eagleMap.put(BOAR, 0);
        eagleMap.put(BUFFALO, 0);
        eagleMap.put(DUCK, 80);
        eagleMap.put(CATERPILLAR, 0);
        eagleMap.put(PLANT, 0);
        eagleMap.put(WOLF, 0);
        eagleMap.put(BOA, 0);
        eagleMap.put(BEAR, 0);
        eagleMap.put(FOX, 10);
        animalToTable.put(EAGLE, eagleMap);
    }


    public int getPercent(TypeOfAnimal predator, TypeOfAnimal prey) {
            return animalToTable.get(predator).get(prey);
    }
}
