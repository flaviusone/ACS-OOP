package ex2_3;

/**
 * Implementare pentru interfata IFactory care creaza obiecte de tip Stack pentru
 * strategia FIFO si obiecte de tip Queue pentru strategia LIFO.
 * @author marius-andrei
 *
 */
public class ContainerFactory implements IFactory {
	
	/**
	 * Folosim pattern-ul Singleton pentru obtinerea unei referinte la obiectul
	 * de tip factory. In acest mod evitam instantierea acestei clase pentru
	 * fiecare situatie in care avem nevoie sa cream containere LIFO sau FIFO
	 */
	public static final IFactory INSTANCE = new ContainerFactory();
	
	/**
	 * Constructorul este privat, pentru a evita instantierea directa a clasei.
	 */
	private ContainerFactory() {
		
	}
	
	public Container createContainer(Strategy strategy) {
		if (strategy == Strategy.FIFO)
			return new Queue();
		else if (strategy == Strategy.LIFO)
			return new Stack();
		else
			return null;
	}
	
}
