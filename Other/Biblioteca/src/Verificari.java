
public class Verificari {
	boolean Dubluexemplar(Carte a,Carte b)
	{
		boolean ok=true;
		if(a.autor.equals(b.autor))
			ok=false;
		else if (a.titlu.equals(b.titlu))
			ok=false;
		return ok;
	}
}
