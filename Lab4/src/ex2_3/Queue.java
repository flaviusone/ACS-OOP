package ex2_3;
import java.util.LinkedList;

import ex1.Task;


/**
 * Container de tip FIFO.
 * @author marius-andrei
 *
 */
public class Queue extends AbstractContainer {

	/**
	 * Lista simplu inlantuita ofera cea mai buna complexitate pentru operatii
	 * de tip FIFO. Atentie, nu este unica alternativa (vezi http://en.wikipedia.org/wiki/Circular_buffer) 
	 */
	private LinkedList<Task> taskList;
	
	/**
	 * Constructorul clasei.
	 */
	public Queue() {
		taskList = new LinkedList<Task>();
	}
	
	/**
	 * Scoate un element din coada. Complexitate: O(1)
	 */
	@Override
	public Task pop() {
		return taskList.pollFirst();
	}

	/**
	 * Adauga un element in coada. Complexitate: O(1)
	 */
	@Override
	public void push(Task task) {
		taskList.add(task);
	}

	/**
	 * Intoarce numarul de elemente din container.
	 */
	@Override
	public int size() {
		return taskList.size();
	}
	
}
