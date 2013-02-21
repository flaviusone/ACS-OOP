import java.util.*;

public class MyEntry implements Map.Entry, Comparable{
	public Object key,value;

    public MyEntry(){}

    public MyEntry(Object key, Object value){
    	this.key=key;
    	this.value=value;
    }

	public Object getKey(){
		return key;
	}

	public Object getValue(){
		return value;
	}

	public Object setValue(Object v){
		value=v;
		return value;
	}

	public int compareTo(Object o){
		MyEntry e=(MyEntry) o;
		Comparable c=(Comparable) e.getKey();
		return -c.compareTo(key);
	}
}