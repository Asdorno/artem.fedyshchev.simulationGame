package factory.entityFactory;

import entity.Entity;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EntityFactory {
    private static EntityFactory instance;

    public Set<Entity> createEntities(Entity prototype, FileReader jsonFile) throws IOException, ParseException {
        Set<Entity> troop = new HashSet<>();

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonFile);
        int maxAmount = (int) (long) jsonObject.get("maxAmountOnCell");

        for (int i = 0; i < (maxAmount / 3); i++) {
            troop.add(prototype.reproduce());
        }

        return troop;
    }

    public static EntityFactory getInstance() {
        if (instance == null) {
            instance = new EntityFactory();
        }
        return instance;
    }

}