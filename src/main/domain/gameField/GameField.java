package gameField;

import java.util.Map;

public class GameField {
    private int width;
    private int height;

    public void setMap(Map<Integer, Map<Integer, Cell>> map) {
        this.map = map;
    }

    public Map<Integer, Map<Integer, Cell>> getMap() {
        return map;
    }

    private Map<Integer, Map<Integer, Cell>> map;
    private static GameField instance;

    public static GameField getInstance() {
        if (instance == null) {
            instance = new GameField();
        }
        return instance;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    //        public void addEntity(Entity entity, int x, int y, Type type) {
//            if (x >= 0 && x < width && y >= 0 && y < height) {
//                Cell cell = map.get(x).get(y);
//                cell.addEntity(entity, type);
//            }
//        }
//
//        public void moveEntity(Entity entity, int fromX, int fromY, int toX, int toY, Type type) {
//            if (fromX >= 0 && fromX < width && fromY >= 0 && fromY < height
//                    && toX >= 0 && toX < width && toY >= 0 && toY < height) {
//                Cell fromCell = map.get(fromX).get(fromY);
//                Cell toCell = map.get(toX).get(toY);
//                fromCell.moveEntity(entity, type, toCell);
//            }
//        }
//
//        public Set<Entity> getEntities(int x, int y, Type type) {
//            if (x >= 0 && x < width && y >= 0 && y < height) {
//                Cell cell = map.get(x).get(y);
//                return cell.getEntities(type);
//            }
//            return Collections.emptySet();
//        }


}