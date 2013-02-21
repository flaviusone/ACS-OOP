
public class Persoana {
	String nume;
	public Persoana(){
		nume = "defaultname";
	}
	public Persoana(String n)
	{
		nume = n;
	}
	public String toString(){
		return this.nume;
	}
	public static void main(String[] args)
	{
		Persoana a [] = new Persoana[2];
		a[0] = new Profesor("POO","Alecu");
		a[1] = new Student(5,"Nanu");
		for ( int i  = 0 ; i<a.length ; i++){
			//if(a[i] instanceof Profesor)
				System.out.println((a[i]).toString());
		}

	}
}
