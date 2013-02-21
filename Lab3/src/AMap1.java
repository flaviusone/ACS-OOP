import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

public class AMap1 extends Dictionary {
	private Vector keys, values;

	public AMap1() {
		keys = new Vector();
		values = new Vector();
	}

	@Override
	public int size() {
		return keys.size();
	}
	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
	@Override
	public Object remove(Object key) {
		return null;
	}
	@Override
	public Enumeration elements() {
		return null;
	}
	@Override
	public Object put(Object key, Object value) {
		int i = keys.indexOf(key);
		if (i < 0) { // key nu exista
			keys.add(key);
			values.add(value);
			return null;
		} else {
			values.set(i, value);
			return value; // ?
		}
	}
    public String toString(){
        String s = new String();
        for (int i = 0; i < keys.size(); i++){
            s = s + " " + keys.elementAt(i) + " " + values.elementAt(i);
        //System.out.println(values.elementAt(i));
        //System.out.println("i = " + i);
        }
        return s;
    }
	//@Override
	public Object get(Object arg0) {
		
			int i = keys.indexOf(arg0);
	
			if (i>=0)
			return values.get(i);
			else return null;
			
	}

	//@Override
	public Enumeration keys() {
		// TODO Auto-generated method stub
		return null;
	}
	
	  public static void main (String arg[]) {
		    Dictionary dic = new AMap1();
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
