package SecondTestNullPointerWithSingleTon;

import org.testng.annotations.Test;

public class FirstTestNGClass extends Settup{
    @Test
    public void firstMethodOfFirstTestNGClass()
    {
        System.out.println("Executing firstMethodOfFirstTestNGClass...");
        System.out.println("Value of someVariable is : " + sharedVariables.getSomeVariable());
        System.out.println("Value of name is :"+ sharedVariablesMap.get("Name"));
    }
    @Test
    public void secondMethodOfFirstTestNGClass()
    {
        System.out.println("Executing secondMethodOfFirstTestNGClass...");
        System.out.println("Value of someVariable is : "+ sharedVariables.getSomeVariable());
        System.out.println("Value of name is :"+ sharedVariablesMap.get("Name"));
    }
}
