package appConfig;

import entity.Entity;

import java.util.Set;

public class PrototypeLoader {
    public static Class<? extends Entity> detectClass(Set<?> set){
        if(set.isEmpty()){
            throw new IllegalArgumentException("Set is empty");
        }
        Object firstElem = set.iterator().next();
        if (firstElem instanceof Entity)
            return (Class<? extends Entity>) firstElem.getClass();
        else return null;
    }
}
