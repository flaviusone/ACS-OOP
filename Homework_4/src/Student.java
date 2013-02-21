public class Student {
	String nume;
	Integer varsta;

	Student(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}
	
	/**
	 * @return hashcode pentru obiectul Student
	 */
	@Override
	public int hashCode() {
		int h = 17;
		h = 37 * h + nume.hashCode();
		h = 37 * h + varsta.hashCode();
		return h;
	}
	/**
	 * @param obiectul de verificat
	 * @return true sau false daca obiectul este egal
	 */
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (s.varsta == this.varsta && s.nume.equals(this.nume))
			return true;
		return false;
	}
}