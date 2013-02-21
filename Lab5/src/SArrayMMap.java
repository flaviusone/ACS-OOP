import java.util.*;

public class SArrayMMap extends SArrayMap{

    public SArrayMMap() {
    }

	public Object put(Object key, Object value){
		MyEntry e=new MyEntry(key,value);
		if(containsKey(key))
			return null;
		sset.add(e);
		return e;
	}

	public static void main(String args[]){
		SArrayMMap map = new SArrayMMap();
		String keys[]={"c","b","c","a","b","c"};
		Integer vals[]={1,2,2,1,1,3};
		for (int i=0;i<keys.length;i++)
			map.put (keys[i],vals[i]);
		System.out.println(map);
	}

}