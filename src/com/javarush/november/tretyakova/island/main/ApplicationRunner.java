package com.javarush.november.tretyakova.island.main;

import com.javarush.november.tretyakova.island.animal.utils.Logger;
import com.javarush.november.tretyakova.island.location.Cell;
import com.javarush.november.tretyakova.island.location.LifeCycle;
import com.javarush.november.tretyakova.island.location.PlantGrowth;
import com.javarush.november.tretyakova.island.model.IslandGenerator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.javarush.november.tretyakova.island.model.IslandGenerator.ISLAND;

public class ApplicationRunner {
    public static final String GAME_OVER = "\nGAME OVER!!!";
    public static int day = 0;

    public static void main(String[] args) {
        ExecutorService executorLifeCycle = Executors.newFixedThreadPool(4);
        ScheduledExecutorService executorPlantGrowth = Executors.newScheduledThreadPool(2);

        IslandGenerator islandGenerator = new IslandGenerator();
        Logger logger = new Logger();
        islandGenerator.initialize();

        while (logger.countAnimalsOnIsland(ISLAND) != 0) {
            day++;
            logger.countAnimalsOnCell(ISLAND);
            for (Cell[] cells : ISLAND) {
                for (Cell cell : cells) {
                    executorPlantGrowth.scheduleWithFixedDelay(new PlantGrowth(cell), 1, 1, TimeUnit.SECONDS);
                    executorLifeCycle.submit(new LifeCycle(cell));
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            logger.printInfo(day);
            logger.clearFields();
        }

        executorLifeCycle.shutdownNow();
        executorPlantGrowth.shutdown();

        System.out.println(GAME_OVER);
        System.out.printf("All the animals were dead on %d day\n", day);
    }
}
