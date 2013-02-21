import java.util.Dictionary;
import java.util.Enumeration;


public class TestClass {

	  public static void main (String arg[]) {
	    Dictionary dic = new AMap1();
	    //Dictionary dic = new AMap2();
	    //Dictionary dic = new AMap3();
	    String d[] = { "c","b","a","c","b","c"};
	    Integer unu = new Integer(1), cnt;
	    for (int i=0;i<d.length;i++)
	       if ( (cnt= (Integer)dic.get (d[i])) ==null)
	          dic.put (d[i],unu);
	       else {
	          int nr = cnt.intValue();
	          dic.put (d[i], new Integer (nr+1));
	       }
	    System.out.println (dic);
	  }
}
