
public class Operatii {
	public NumarComplex Adunare(NumarComplex x, NumarComplex y)
	{
		NumarComplex z = new NumarComplex();
		z.re = x.re + y.re;
		z.im = x.im + y.im;
		return z;
	}
	public NumarComplex Inmultire(NumarComplex x , NumarComplex y)
	{
		NumarComplex z = new NumarComplex();
		z.re=(x.re * y.re) - (x.im * y.im);
		z.im=(x.im * y.re) + (x.re * y.im);
		return z;
	}
}
