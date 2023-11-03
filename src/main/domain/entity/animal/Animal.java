package entity.animal;

import entity.Entity;

public abstract class Animal extends Entity {

    Animal(String name) {
        super(name);
    }

    @Override
    //animal has to be not hungry/fed to give birth
    public abstract Entity reproduce();//make as an interface?

    public void eat() {
    }//make as an interface???

    public void move() {
    }//make as an interface???
}
