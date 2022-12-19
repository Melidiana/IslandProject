package com.javarush.november.tretyakova.island.location;
import com.javarush.november.tretyakova.island.animal.Animal;
import com.javarush.november.tretyakova.island.enumerator.Type;
import com.javarush.november.tretyakova.island.plant.Plants;
import com.javarush.november.tretyakova.island.typesOfCreatures.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import static com.javarush.november.tretyakova.island.enumerator.Type.*;


public class Cell {
    private final Map<Type, List<? extends Animal>> animals = new HashMap<>();
    private final List<Plants> plants = new ArrayList<>();

    public Cell() {
        populateByType(WOLF, getRandomNumberFromRange(0, 30));
        populateByType(BOA, getRandomNumberFromRange(0, 30));
        populateByType(FOX, getRandomNumberFromRange(0, 30));
        populateByType(BEAR, getRandomNumberFromRange(0, 5));
        populateByType(EAGLE, getRandomNumberFromRange(0, 20));
        populateByType(HORSE, getRandomNumberFromRange(0, 20));
        populateByType(DEER, getRandomNumberFromRange(0, 20));
        populateByType(RABBIT, getRandomNumberFromRange(0, 150));
        populateByType(MOUSE, getRandomNumberFromRange(0, 500));
        populateByType(GOAT, getRandomNumberFromRange(0, 140));
        populateByType(SHEEP, getRandomNumberFromRange(0, 140));
        populateByType(BOAR, getRandomNumberFromRange(0, 50));
        populateByType(BUFFALO, getRandomNumberFromRange(0, 10));
        populateByType(DUCK, getRandomNumberFromRange(0, 200));
        populateByType(CATERPILLAR, getRandomNumberFromRange(0, 1000));
        populateByType(PLANT, getRandomNumberFromRange(0, 200));

    }

    public Map<Type, List<? extends Animal>> getAnimals() {
        return animals;
    }

    public List<Plants> getPlants() {
        return plants;
    }

    private Map<Type, List<? extends Animal>> populateByType(Type name, int times) {
        switch (name) {
            case WOLF:
                List<Wolf> wolves = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    wolves.add(new Wolf());
                }
            case BOA:
                List<Boa> boas = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    boas.add(new Boa());
                }
            case FOX:
                List<Fox> foxes = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    foxes.add(new Fox());
                }
            case BEAR:
                List<Bear> bears = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    bears.add(new Bear());
                }
            case EAGLE:
                List<Eagle> eagles = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    eagles.add(new Eagle());
                }
            case HORSE:
                List<Horse> horses = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    horses.add(new Horse());
                }
            case DEER:
                List<Deer> deer = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    deer.add(new Deer());
                }
            case RABBIT:
                List<Rabbit> rabbits = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    rabbits.add(new Rabbit());
                }
            case MOUSE:
                List<Mouse> mice = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    mice.add(new Mouse());
                }
            case GOAT:
                List<Goat> goats = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    goats.add(new Goat());
                }
            case SHEEP:
                List<Sheep> sheep = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    sheep.add(new Sheep());
                }
            case BOAR:
                List<Boar> boars = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    boars.add(new Boar());
                }
            case BUFFALO:
                List<Buffalo> buffaloes = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    buffaloes.add(new Buffalo());
                }
            case DUCK:
                List<Duck> ducks = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    ducks.add(new Duck());
                }
            case CATERPILLAR:
                List<Caterpillar> caterpillars = new ArrayList<>();
                for (int i = 0; i < times; i++) {
                    caterpillars.add(new Caterpillar());
                }
            case PLANT:
                for (int i = 0; i < times; i++) {
                    plants.add(new Plant());
                }
        }
        return animals;
    }

    public int getRandomNumberFromRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
