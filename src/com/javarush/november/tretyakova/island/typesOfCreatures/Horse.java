package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parameters;

public class Horse extends Herbivores {
    protected Horse(Parameters parameters) {
        super(Parameters.HORSE_PARAMETERS);
    }
}
