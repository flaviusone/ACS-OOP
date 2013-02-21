package ex1;

/**
 * Task-ul care genereaza un numar aleator pe care il afiseaza la output
 * @author marius-andrei
 *
 */
public class RandomNumberTask implements Task {

	public RandomNumberTask(int max) {
		number = (int)(Math.random() * max);
	}
	
	@Override
	public void execute() {
		System.out.println("Generated: " + number);
	}

	public int getNumber() {
		return number;
	}
	
	private int number;
}
