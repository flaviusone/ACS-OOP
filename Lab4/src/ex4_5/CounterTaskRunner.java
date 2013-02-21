package ex4_5;
import ex1.Task;
import ex2_3.Strategy;

/**
 * TaskRunner care numara cate task-uri s-au executat.
 * @author marius-andrei
 *
 */
public class CounterTaskRunner extends AbstractTaskRunner {

	/**
	 * Counter trebuie sa fie un membru ascuns. Altfel, acest camp ar putea fi
	 * modificat din exterior aducand obiectul CounterTaskRunner intr-o stare
	 * inconsistenta. 
	 */
	private int counter;
	
	public CounterTaskRunner(Strategy strategy) {
		super(strategy);
		counter = 0;
	}

	/**
	 * Getter pentru counter. Observati ca nu exista un setter (vezi explicatia de mai sus)
	 * @return Valoarea curenta a counter-ului.
	 */
	public int getCounter() {
		return counter;
	}
	
	/**
	 * Actiunea post-executie specifica acestei clase.
	 */
	@Override
	protected void afterExecution(Task task) {
		counter++;		
	}
	
}
