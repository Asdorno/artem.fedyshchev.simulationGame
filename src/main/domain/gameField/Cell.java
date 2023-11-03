package gameField;

import appConfig.PrototypeLoader;
import entity.Entity;
import factory.entityFactory.EntityFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell {
    private final Map<Class<? extends Entity>, Set<Entity>> entities;

    public Cell() {
        entities = new HashMap<>();
    }

    public Map<Class<? extends Entity>, Set<Entity>> getEntities() {
        return entities;
    }

    public void addTroop(Set<Entity> troop) {
        entities.put(PrototypeLoader.detectClass(troop), troop);
    }

    public void addEntity() {
    }

}
