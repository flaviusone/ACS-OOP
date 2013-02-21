package ex4_5;

import ex1.Task;
import ex2_3.Strategy;

/**
 * TaskRunner care executa task-urile cu intarziere.
 * @author marius-andrei
 *
 */
public class DelayTaskRunner extends PrinterTaskRunner {

	private long delay;
	
	public DelayTaskRunner(Strategy strategy, long delay) {
		super(strategy);
		this.delay = delay;
	}
	
	@Override
	protected void afterExecution(Task task) {
		// Folosim metoda din clasa parinte pentru afisarea momentului in care
		// s-a executat task-ul
		super.afterExecution(task);
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
