package com.javarush.november.tretyakova.island.settings;
import java.util.HashMap;
import java.util.Map;

public class Settings {
    private final Map<String, Map<String, Integer>> animalToTable = new HashMap<>(); {

        Map<String, Integer> wolfMap = new HashMap<>();
        wolfMap.put("horse", 10);
        wolfMap.put("deer", 15);
        wolfMap.put("rabbit", 60);
        wolfMap.put("mouse", 80);
        wolfMap.put("goat", 60);
        wolfMap.put("sheep", 70);
        wolfMap.put("boar", 15);
        wolfMap.put("buffalo", 10);
        wolfMap.put("duck", 40);
        wolfMap.put("caterpillar", 0);
        wolfMap.put("plant", 0);
        wolfMap.put("boa", 0);
        wolfMap.put("fox", 0);
        wolfMap.put("bear", 0);
        wolfMap.put("eagle", 0);
        animalToTable.put("wolf", wolfMap);

        Map<String, Integer> boaMap = new HashMap<>();
        boaMap.put("horse", 0);
        boaMap.put("deer", 0);
        boaMap.put("rabbit", 20);
        boaMap.put("mouse", 40);
        boaMap.put("goat", 0);
        boaMap.put("sheep", 0);
        boaMap.put("boar", 0);
        boaMap.put("buffalo", 0);
        boaMap.put("duck", 10);
        boaMap.put("caterpillar", 0);
        boaMap.put("plant", 0);
        boaMap.put("wolf", 0);
        boaMap.put("fox", 0);
        boaMap.put("bear", 0);
        boaMap.put("eagle", 0);
        animalToTable.put("boa", boaMap);

        Map<String, Integer> foxMap = new HashMap<>();
        foxMap.put("horse", 0);
        foxMap.put("deer", 0);
        foxMap.put("rabbit", 70);
        foxMap.put("mouse", 90);
        foxMap.put("goat", 0);
        foxMap.put("sheep", 0);
        foxMap.put("boar", 0);
        foxMap.put("buffalo", 0);
        foxMap.put("duck", 60);
        foxMap.put("caterpillar", 40);
        foxMap.put("plant", 0);
        foxMap.put("wolf", 0);
        foxMap.put("boa", 0);
        foxMap.put("bear", 0);
        foxMap.put("eagle", 0);
        animalToTable.put("fox", foxMap);

        Map<String, Integer> bearMap = new HashMap<>();
        bearMap.put("horse", 40);
        bearMap.put("deer", 80);
        bearMap.put("rabbit", 80);
        bearMap.put("mouse", 90);
        bearMap.put("goat", 70);
        bearMap.put("sheep", 70);
        bearMap.put("boar", 50);
        bearMap.put("buffalo", 20);
        bearMap.put("duck", 10);
        bearMap.put("caterpillar", 0);
        bearMap.put("plant", 0);
        bearMap.put("wolf", 0);
        bearMap.put("boa", 80);
        bearMap.put("fox", 0);
        bearMap.put("eagle", 0);
        animalToTable.put("bear", bearMap);

        Map<String, Integer> eagleMap = new HashMap<>();
        eagleMap.put("horse", 0);
        eagleMap.put("deer", 0);
        eagleMap.put("rabbit", 90);
        eagleMap.put("mouse", 90);
        eagleMap.put("goat", 0);
        eagleMap.put("sheep", 0);
        eagleMap.put("boar", 0);
        eagleMap.put("buffalo", 0);
        eagleMap.put("duck", 80);
        eagleMap.put("caterpillar", 0);
        eagleMap.put("plant", 0);
        eagleMap.put("wolf", 0);
        eagleMap.put("boa", 0);
        eagleMap.put("bear", 0);
        eagleMap.put("fox", 10);
        animalToTable.put("eagle", eagleMap);
    }


    public int getPersent(String predator, String price) {
        // NPE???
        return animalToTable.get(predator).get(price);
    }
}
