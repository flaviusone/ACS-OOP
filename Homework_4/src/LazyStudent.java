public class LazyStudent extends Student {
	String nume;
	Integer varsta;

	LazyStudent(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return hashcode pentru obiectul Student
	 */
	@Override
	public int hashCode() {
		return 2;
	}

}
