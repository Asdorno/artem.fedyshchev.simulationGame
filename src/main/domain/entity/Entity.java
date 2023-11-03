package entity;

import entity.animal.herbivore.Buffalo;
import entity.animal.predator.Bear;
import entity.plant.Grass;

public abstract class Entity {
    public static int entityCounter = 0;
    public String name;

    protected Entity(String name) {
        this.name = name;
    }

    abstract public Entity reproduce();

    public void die() {
    }

    public Type getType(Entity entity) {
        if (entity instanceof Buffalo) {
            return Type.buffalo;
        } else if (entity instanceof Bear) {
            return Type.bear;
        } else if (entity instanceof Grass) {
            return Type.grass;
        } else return null;
    }
}
