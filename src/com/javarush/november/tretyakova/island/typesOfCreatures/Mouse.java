package com.javarush.november.tretyakova.island.typesOfCreatures;
import com.javarush.november.tretyakova.island.animal.Herbivores;
import com.javarush.november.tretyakova.island.animal.Parameters;

public class Mouse extends Herbivores {
    protected Mouse(Parameters parameters) {
        super(Parameters.MOUSE_PARAMETERS);
    }
}
