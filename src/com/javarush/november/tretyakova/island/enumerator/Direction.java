package com.javarush.november.tretyakova.island.enumerator;
import java.util.Random;

public enum Direction {
    UP, DOWN, LEFT, RIGHT, OnSPOT;

    public static Direction generateRandomDirection() {
        Direction[] values = Direction.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}

