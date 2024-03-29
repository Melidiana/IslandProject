package com.javarush.november.tretyakova.island.location;

import com.javarush.november.tretyakova.island.animal.kind.plant.Plant;
import com.javarush.november.tretyakova.island.animal.utils.Counter;
import com.javarush.november.tretyakova.island.config.Configuration;

import java.util.concurrent.ThreadLocalRandom;

public class PlantGrowth implements Runnable {
    public static final String PLANT = "Plant";
    private final Cell cell;

    public PlantGrowth(Cell cell) {
        this.cell = cell;
    }

    @Override
    public void run() {
        growing();
    }

    private void growing() {
        for (int i = 0; i < Configuration.plantFields.get(PLANT).getMaxCount(); i++) {
            boolean isGrowing = ThreadLocalRandom.current().nextBoolean();
            if (isGrowing) {
                cell.getLock().lock();
                try {
                    cell.getPlants().add(new Plant());
                    Counter.countPlantBirth();
                } finally {
                    cell.getLock().unlock();
                }

            }
        }
    }
}
