package ex1;

/**
 * Clasa care implementeaza interfata Task, incrementand un contor global
 * la orice apel asupra metodei execute.
 * @author marius-andrei
 *
 */
public class GlobalCounterTask implements Task {

	private static int globalCounter = 0;
	
	@Override
	public void execute() {
		globalCounter++;
		System.out.println("Global counter is: " + globalCounter);
	}
	
	public static int getCounter() {
		return globalCounter;
	}

}
