package Animals.Species;

public abstract class Animal {
    private double weight;
    private int maxQuantityOnCell;
    private int maxSpeed;
    private int toWellFed;


    public void eat() {

    }

    public void move() {

    }

    public Animal giveBirth() {
        return null;
    }

    public void die() {

    }

    public void starve() {
        die();
    }

    public void beMurdered() {
        die();
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxQuantityOnCell() {
        return maxQuantityOnCell;
    }

    public void setMaxQuantityOnCell(int maxQuantityOnCell) {
        this.maxQuantityOnCell = maxQuantityOnCell;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getToWellFed() {
        return toWellFed;
    }

    public void setToWellFed(int toWellFed) {
        this.toWellFed = toWellFed;
    }
}
