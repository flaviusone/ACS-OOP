
public class NumarComplex {
	float re,im;
	public static void main(String[] args)
	{
		NumarComplex a = new NumarComplex();
		NumarComplex b = new NumarComplex();
		
		a.re=5;a.im=6;
		b.re=3;b.im=2;
		
		NumarComplex c = new NumarComplex();
		
		Operatii Op = new Operatii();
		c=Op.Adunare(a,b);
		System.out.println("Rezultat Adunare: " + c.re + " + " + c.im + "i");
		c=Op.Inmultire(a,b);
		System.out.println("Rezultat Inmultire: " + c.re + " + " + c.im + "i");
		
		
	}
}
