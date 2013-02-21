
public class Profesor  extends Persoana{
	String materie;
	public Profesor()
	{
		materie = "Materie";
		super.nume = "NumeProfesor";
	}
	public Profesor(String mat,String name)
	{
		materie = mat; 
		super.nume = name;
	}
	public String toString()
	{
		return "Profesor " + super.nume + " " + materie; 
	}
	
}
