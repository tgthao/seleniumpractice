package SecondTestNullPointerWithSingleTon;

import org.testng.annotations.BeforeSuite;

public class Settup {
    SharedVariables sharedVariables = SharedVariables.getInstance();
    SharedVariablesMap sharedVariablesMap = SharedVariablesMap.getInstance();

    @BeforeSuite
    public void setupVariable() {
        System.out.println("Executing setupVariable...");
        sharedVariables.setSomeVariable("someValue");
        sharedVariablesMap.store("Name", "Amod");
    }
}
