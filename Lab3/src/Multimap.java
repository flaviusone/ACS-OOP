import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;


public class Multimap extends Hashtable {
	private Vector keys,values;
	public Multimap()
	{
		keys = new Vector();
		values = new Vector();
	}
	

	  public static void main (String arg[]) {
		    Multimap dic= new Multimap();
		    int n=10;   		// nr. de perechi cheie-valoare adaugate
		    for (int i=1;i<n;i++)
		      dic.put (i%5+1+"", (i+2)%8+1+"");
		    System.out.println (dic);
		     // afisare prin enumerare
		    Enumeration ek = dic.keys(); 
		    Enumeration ev = dic.elements(); 
		    while (ek.hasMoreElements())
		    	System.out.println(ek.nextElement()+":"+ ev.nextElement()) ; 	
		  }
	  
}
