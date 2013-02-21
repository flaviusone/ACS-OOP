package ex4_5;
import ex1.Task;
import ex2_3.Container;
import ex2_3.ContainerFactory;
import ex2_3.Strategy;

/**
 * Clasa abstracta care se ocupa de rularea unei colectii de task-uri.
 * @author marius-andrei
 *
 */
public abstract class AbstractTaskRunner {
	private Container container;
	
	/**
	 * Constructorul clasei
	 * @param strategy Specifica ordinea in care se executa task-urile
	 */
	public AbstractTaskRunner(Strategy strategy) {
		container = ContainerFactory.INSTANCE.createContainer(strategy);
	}
	
	/**
	 * Adauga un task in colectia de task-uri ce trebuie sa fie executate.
	 * @param task Task-ul adaugat
	 */
	public void addTask(Task task) {
		container.push(task);
	}
	
	/**
	 * Executa toate task-urile din colectie
	 */
	public void executeAll() {
		while (!container.isEmpty()) {
			Task task = container.pop();
			task.execute();
			// Actiunea abstracta care urmeaza executiei unui task.
			afterExecution(task);
		}
	}
	
	/**
	 * Metoda abstracta prin care se va specifica actiunea ce va fi realizata
	 * dupa executia unui task.
	 * @param task Task-ul proaspat executat.
	 */
	protected abstract void afterExecution(Task task);
	
}
