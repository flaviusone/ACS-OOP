//class student
public class Student extends Persoana {
	int nota;
	public Student(){
		nota = 0;
	}
	public Student(int a,String name){
		nota = a;
		super.nume = name;
	}
	public String toString()
	{
		return "Student " + super.nume + " " + nota;
	}
	public boolean equals(String i)
	{
		return i.equals(super.nume);
	}
}
