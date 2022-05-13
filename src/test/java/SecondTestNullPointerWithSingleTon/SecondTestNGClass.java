package SecondTestNullPointerWithSingleTon;

import org.testng.annotations.Test;

public class SecondTestNGClass extends Settup{
    @Test
    public void firstMethodOfSecondTestNGClass()
    {
        System.out.println("Executing firstMethodOfSecondTestNGClass...");
        System.out.println("Value of someVariable is : "+ sharedVariables.getSomeVariable());
        System.out.println("Value of name is :"+ sharedVariablesMap.get("Name"));
    }

    @Test
    public void secondMethodOfSecondTestNGClass()
    {
        System.out.println("Executing secondMethodOfSecondTestNGClass...");
        System.out.println("Value of someVariable is : "+ sharedVariables.getSomeVariable());
        System.out.println("Value of name is :"+ sharedVariablesMap.get("Name"));
    }
}
