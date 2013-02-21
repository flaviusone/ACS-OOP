import java.util.*;
import java.lang.*;

public class ArraySet extends AbstractSet{
	ArrayList al;

    public ArraySet() {
    	al=new ArrayList();
    }

    public int size(){
    	return al.size();
    }

    public Iterator iterator(){
    	return al.iterator();
    }

    public boolean add(Object x){
    	if(contains(x)) return false;
    	else
    		return al.add(x);
    }

    public static void main(String args[]){
    	String d[]={"c","b","a","c","b","c"};
    	Set set=new ArraySet();
    	for(int i=0;i<d.length;i++){
    		set.add(d[i]);
    	}
    	System.out.println(set);
    }

}