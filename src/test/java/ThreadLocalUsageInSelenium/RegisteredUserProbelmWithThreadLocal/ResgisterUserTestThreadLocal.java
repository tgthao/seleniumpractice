package ThreadLocalUsageInSelenium.RegisteredUserProbelmWithThreadLocal;

public class ResgisterUserTestThreadLocal {

	public static void main(String[] args) throws InterruptedException {		
		
		ThreadLocalRegisterUser registerUser = new ThreadLocalRegisterUser();
		// Creating two threads and both are using same instance of RegisteredUser class
		Thread thread1 = new Thread(registerUser);
		Thread thread2 = new Thread(registerUser);
		// Starting first thread
		thread1.start();
		// Giving a pause
		Thread.sleep(2000);
		// Starting another thread
		thread2.start();
		
	}
}
