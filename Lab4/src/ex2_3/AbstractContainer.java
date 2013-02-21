package ex2_3;


/**
 * Clasa intermediara care specifica un trunchi comun pentru clase precum Stack
 * si Queue.
 * Intrucat metodele isEmpty() si transferFrom() vor avea acelasi cod in clasele
 * Stack si Queue preferam sa abstractizam acea parte comuna in acest container
 * abstract intermediar.
 * @author marius-andrei
 *
 */
public abstract class AbstractContainer implements Container {

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}



	@Override
	public void transferFrom(Container container) {
		while (!container.isEmpty())
			push(container.pop());		
	}
	
	
	
}
