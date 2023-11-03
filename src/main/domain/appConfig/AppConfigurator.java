package appConfig;

import entity.Entity;
import factory.entityFactory.EntityFactory;
import factory.gameFieldFactory.GameFieldFactory;
import gameField.Cell;
import gameField.GameField;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppConfigurator {
    //there must be all the methods, that participate in creating our gamefield, then entities, then run life method, that will execute multithreading
    Scanner scanner = new Scanner(System.in);
    private static AppConfigurator instance;
    private static Map<Entity, FileReader> prototypes = new HashMap<>();

    public void init() {
        //must create gameField, add there entities
        initGameField();
        loadPrototypes();
        initEntities();
    }

    private void loadPrototypes() {
        //must initialize Set<Entity, FileReader> prototypes,
    }

    private void initEntities() {
        //must use set of prototypes, to call createEntities(Entity prototype, FileReader jsonFile)
        prototypes.forEach((prototype, fileReader) -> {
            try {
                for (int x = 0; x < GameField.getInstance().getWidth(); x++) {
                    for (int y = 0; y < GameField.getInstance().getHeight(); y++) {
                        Cell cell = GameField.getInstance().getMap().get(x).get(y);
                        cell.addTroop(EntityFactory.getInstance().createEntities(prototype, fileReader));
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        });

    }

    public void initGameField() {
        GameFieldFactory.getInstance().createGameField(setWidth(), setHeight());
    }

    public static AppConfigurator getInstance() {
        if (instance == null) {
            instance = new AppConfigurator();
        }
        return instance;
    }

    private int setHeight() {
        System.out.println("Enter height of the game field");
        return scanner.nextInt();
    }

    private int setWidth() {
        System.out.println("Enter width of the game field");
        return scanner.nextInt();
    }
}
