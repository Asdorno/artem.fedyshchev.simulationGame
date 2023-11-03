package factory.gameFieldFactory;

import gameField.Cell;
import gameField.GameField;

import java.util.HashMap;
import java.util.Map;


public class GameFieldFactory {
    private static GameFieldFactory instance;
    public void createGameField(int width, int height) {
        Map<Integer, Map<Integer, Cell>> map = new HashMap<>();
        for (int x = 0; x < width; x++) {
            map.put(x, new HashMap<>());
            for (int y = 0; y < height; y++) {
                map.get(x).put(y, new Cell());
            }
        }
        GameField.getInstance().setMap(map);
    }

    public static GameFieldFactory getInstance() {
        if (instance == null){
            instance = new GameFieldFactory();
        }
        return instance;
    }

}
