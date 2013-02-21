package ex2_3;
import java.util.ArrayList;

import ex1.Task;


/**
 * Implementare pentru container de tip LIFO.
 * @author marius-andrei
 *
 */
public class Stack extends AbstractContainer {

	/**
	 * ArrayList este structura cea mai potrivita pentru manipulari de tip LIFO.
	 * Vom adauga/scoate elemente de la sfarsitul vectorului.
	 */
	private ArrayList<Task> taskList;
	
	public Stack() {
		taskList = new ArrayList<Task>();
	}
	
	/**
	 * Scoate un element din stiva. Complexitate: O(1)
	 */
	@Override
	public Task pop() {
		Task elem;
		if (taskList.isEmpty())
			elem = null;
		else {
			elem = taskList.get(taskList.size() - 1);
			taskList.remove(taskList.size() - 1);
		}
		return elem;
	}

	/**
	 * Adauga un task in stiva. Complexitate (amortizata): O(1)
	 */
	@Override
	public void push(Task task) {
		taskList.add(task);
	}

	/**
	 * Intoarce numarul de elemente din stiva.
	 */
	@Override
	public int size() {
		return taskList.size();
	}
	
}
