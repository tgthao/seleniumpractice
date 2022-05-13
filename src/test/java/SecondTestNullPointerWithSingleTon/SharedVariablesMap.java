package SecondTestNullPointerWithSingleTon;

import java.util.HashMap;

public class SharedVariablesMap {
    // Private instance of class
    private static final SharedVariablesMap instance = new SharedVariablesMap();

    private static HashMap<String,Object> dataStore = new HashMap<>();

    // Private constructor to control object creation of class
    private SharedVariablesMap() {
    }

    // Return unidealized instance of class
    public static SharedVariablesMap getInstance() {
        return instance;
    }

    public void store(String key, String value)
    {
        dataStore.put(key, value);
    }

    public Object get(String key)
    {
        return dataStore.get(key);
    }
}
