package SecondTestNullPointerWithSingleTon;

public class SharedVariables {
    private static final SharedVariables instance = new SharedVariables();

    // Private constructor to control object creation of class
    private SharedVariables() {
    }

    // Return unidealized instance of class
    public static SharedVariables getInstance() {
        return instance;
    }

    // A private variable with getter and setter methods
    private String someVariable;

    public String getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(String someVariable) {
        this.someVariable = someVariable;
    }
}
