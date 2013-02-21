package ex1;

/**
 * Clasa care reprezinta task-ul ce afiseaza un mesaj la apelul metodei
 * execute.
 * @author marius-andrei
 *
 */
public class MessageTask implements Task {

	public MessageTask(String message) {
		setMessage(message);
	}
		
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


	@Override
	public void execute() {
		System.out.println(message);		
	}
	
	private String message;
	
}
