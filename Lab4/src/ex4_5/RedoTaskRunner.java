package ex4_5;
import ex1.Task;
import ex2_3.Container;
import ex2_3.ContainerFactory;
import ex2_3.Strategy;

/**
 * TaskRunner care permite reexecutia, in ordine inversa, a task-urilor executate.
 * @author marius-andrei
 *
 */
public class RedoTaskRunner extends AbstractTaskRunner {

	/**
	 * Folosim un container in care vom salva task-urile executate.
	 */
	private Container saveContainer;
	
	public RedoTaskRunner(Strategy strategy) {
		super(strategy);
		// Observati folosirea pattern-ului factory. Folosim un container
		// LIFO pentru a permite executia in ordine inversa.
		saveContainer = ContainerFactory.INSTANCE.createContainer(Strategy.LIFO);
	}

	/**
	 * Actiunea specifica acestui TaskRunner.
	 */
	@Override
	protected void afterExecution(Task task) {
		saveContainer.push(task);		
	}
	
	/**
	 * Metoda prin care se reexecuta task-urile in ordine inversa.
	 */
	public void redo() {
		while (!saveContainer.isEmpty()) {
			saveContainer.pop().execute();
		}
	}

}
