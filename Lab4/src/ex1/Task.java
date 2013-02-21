package ex1;

/**
 * Interfata specifica obiectelor de tip task. Interfetele contin doar metode
 * abstracte. Toate metodele unei interfete pot avea doar specificatorul de
 * acces 'public' (Puteti sa nu scrieti public in definitie - compilatorul
 * va seta automat acest specificator.
 * @author marius-andrei
 *
 */
public interface Task {

	/**
	 * Executa actiunea caracteristica task-ului.
	 */
	void execute();	
	
}
