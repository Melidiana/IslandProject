package com.javarush.november.tretyakova.island.model;

import com.javarush.november.tretyakova.island.config.Configuration;
import com.javarush.november.tretyakova.island.location.Cell;

public class IslandGenerator {

    public static final Cell[][] ISLAND = new Cell[Configuration.row][Configuration.column];

    public void initialize() {
        for (int i = 0; i < ISLAND.length; i++) {
            for (int j = 0; j < ISLAND[i].length; j++) {
                ISLAND[i][j] = new Cell(i, j);
            }
        }
    }
}
