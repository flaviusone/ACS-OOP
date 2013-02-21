import java.util.*;

public class SArrayMap extends AbstractMap{
	SArraySet sset;

    public SArrayMap() {
    	sset=new SArraySet();
    }

	public Object put(Object key, Object value){
		MyEntry e=new MyEntry(key,value);
		if(containsKey(key))
			return null;
		sset.add(e);
		return e;
	}

	// returneaza SArraySet
	public Set entrySet(){
		return sset;
	}


	public static void main(String args[]){
		SArrayMap map = new SArrayMap();
		String d[] = {"c","b","a","c","b","c"};
		Integer unu = new Integer(1), cnt;
		for (int i=0;i<d.length;i++)
			if ( (cnt= (Integer)map.get(d[i]) ) ==null)
				map.put (d[i],unu);
			else {
				int nr = cnt.intValue();
				map.put (d[i], new Integer (nr+1));
			}
		System.out.println (map);
	}
}