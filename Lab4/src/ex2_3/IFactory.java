package ex2_3;

/**
 * Interfata implmenentata de toate clasele care se vor ocupa cu crearea de
 * containere specifice unei anumite strategii.
 * @author marius-andrei
 *
 */
public interface IFactory {
	
	/**
	 * Creaza un container care implementeaza strategia primita ca parametru.
	 * @param strategy Strategia ceruta
	 * @return Un container care respecta strategia primita ca parametru.
	 */
	Container createContainer(Strategy strategy);
	
}
