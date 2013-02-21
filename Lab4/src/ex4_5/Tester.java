package ex4_5;


import ex1.*;
import ex2_3.*;
import ex4_5.*;

public class Tester {

	private static final int TASK_NO = 6;
	
	private static Task[] taskList;
	
	private static void test1() {
		taskList = new Task[TASK_NO];
		taskList[0] = new MessageTask("First message task");
		taskList[1] = new RandomNumberTask(20);
		taskList[2] = new GlobalCounterTask();
		taskList[3] = new MessageTask("Second message task");
		taskList[4] = new GlobalCounterTask();
		taskList[5] = new RandomNumberTask(10);
		
		/**
		 * Constructie speciala prin care se poate parcurge un vector sau un
		 * container de tip java.util.Collection;
		 */
		for (Task task : taskList) {
			task.execute();
		}
	}
	
	static private void testContainer(Strategy strategy) {
		Container container = ContainerFactory.INSTANCE.createContainer(strategy);
		for (Task task : taskList)
			container.push(task);
		System.out.println("Testing order: " + strategy);
		while (!container.isEmpty())
			container.pop().execute();
		System.out.println();
	}
	
	private static void test2_3() {
		testContainer(Strategy.LIFO);
		testContainer(Strategy.FIFO);
	}
	
	private static void testTaskRunner(AbstractTaskRunner taskRunner) {
		System.out.println("Testing: " + taskRunner);
		for (Task task : taskList) {
			taskRunner.addTask(task);
		}
		taskRunner.executeAll();
		System.out.println();
	}
	
	private static void test4_5() {
		testTaskRunner(new PrinterTaskRunner(Strategy.LIFO));
		
		CounterTaskRunner counterTaskRunner =
			new CounterTaskRunner(Strategy.FIFO); 
		testTaskRunner(counterTaskRunner);
		System.out.println("#Executed tasks: " + counterTaskRunner.getCounter());
		
		RedoTaskRunner redoTaskRunner = new RedoTaskRunner(Strategy.LIFO);
		testTaskRunner(redoTaskRunner);
		System.out.println("Reexecuting: ");
		redoTaskRunner.redo();
		
		testTaskRunner(new DelayTaskRunner(Strategy.LIFO, 2000));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test1();
		System.out.println("-------------------------");
		test2_3();
		System.out.println("-------------------------");
		test4_5();
	}

}
