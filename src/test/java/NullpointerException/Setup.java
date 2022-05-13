package NullpointerException;
import org.testng.annotations.BeforeSuite;

public class Setup {

	public  String someVariable;

	@BeforeSuite
	public void setupVariable() {
		System.out.println("Executing setupVariable...");
		someVariable = "someValue";
	}

}
