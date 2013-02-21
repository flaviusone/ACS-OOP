import java.util.*;
import java.lang.*;

public class SArraySet extends ArrayList implements Set{
	Comparator c;

    public SArraySet() {
		c=null;
    }

    public SArraySet(Comparator c){
		this.c=c;
    }

	public int size(){
    	return super.size();
    }

    public Iterator iterator(){
    	return super.iterator();
    }

    public boolean add(Object x){
    	if(super.contains(x)) return false;
    	else
    		if(c==null){
    			super.add(x);
    			Collections.sort(this);
    			return true;
    		}
    		else{
    			super.add(x);
    			Collections.sort(this,c);
    			return true;
    		}
    }

    public void add(int i, Object e){
		throw new UnsupportedOperationException();
    }

    public static void main(String args[]){
		String d[] = {"c","b","a","c","b","c"};
		Set set = new SArraySet();
			for (int i=0;i<d.length;i++)
				set.add (d[i]);
		System.out.println(set);
		Set set2 = new SArraySet (Collections.reverseOrder());
		for (int i=0;i<d.length;i++)
			set2.add (d[i]);
		System.out.println(set2);
    }
}