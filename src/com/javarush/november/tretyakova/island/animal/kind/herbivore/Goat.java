package com.javarush.november.tretyakova.island.animal.kind.herbivore;

import com.javarush.november.tretyakova.island.animal.Fields;

public class Goat extends Herbivore {
    public static int deathCounter = 0;
    public static int moveCounter = 0;
    public static int bornCounter = 0;

    public Goat(Fields fields) {
        super(fields);
    }
}
