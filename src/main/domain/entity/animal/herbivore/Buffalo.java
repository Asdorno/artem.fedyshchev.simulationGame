package entity.animal.herbivore;

public class Buffalo extends Herbivorous {
    public static int buffaloCounter = 0;
    private int hunger;

    public Buffalo(String name) {
        super(name+buffaloCounter++);
    }

    @Override
    public Buffalo reproduce() {
        return new Buffalo(this.getClass().getSimpleName());
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}
