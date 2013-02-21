package ex4_5;
import java.util.Date;

import ex1.Task;
import ex2_3.Strategy;


/**
 * TaskRunner care afiseaza un mesaj dupa executia unui task.
 * @author marius-andrei
 *
 */
public class PrinterTaskRunner extends AbstractTaskRunner {

	public PrinterTaskRunner(Strategy strategy) {
		super(strategy);
	}

	/**
	 * Implementarea specifica a metodei afterExecution.
	 */
	@Override
	protected void afterExecution(Task task) {
		System.out.println("Executed task at " + new Date().toString());
	}

}
