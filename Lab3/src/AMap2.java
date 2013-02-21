/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Vector;
import java.util.Enumeration;
import java.util.Dictionary;


/**
 *
 * @author student
 */
public class AMap2 extends Dictionary{
    Vector<Entry> v = new Vector();
     
    public AMap2(){ }
     @Override
    public Enumeration<Object> elements() {
        return null;
    }
     
    @Override
    public Object get(Object key) {
        for(int i = 0; i < v.size(); i++) {
            if(v.elementAt(i).getKey().equals(key)) {
                return v.elementAt(i).getValue();
            }
        }
        return null;
    }
    
    @Override
    public boolean isEmpty() {
        return v.isEmpty();
    }
    
    @Override
    public Enumeration<Object> keys() {
        return null;
    }
    
    @Override
    public Object put(Object key, Object value) {
        if( get(key) != null) {
            remove(key);
        }
        Entry el = new Entry(key,value);
        v.add(el);
        return el;
    }
    
    @Override
    public Object remove(Object key) {
        for(int i = 0; i < v.size(); i++) {
            if(v.elementAt(i).getKey().equals(key)) {
                v.remove(i);
                return null;
            }
        }
        return null;
    }
    
    @Override
    public int size() {
        return v.size();
    }
    
    @Override
    public String toString() {
        String s = new String();
        for(int i = 0; i < v.size(); i++)
            s = s + " " + v.elementAt((i));
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Dictionary dic = new AMap2();
        String d[] = { "c","b","a","c","b","c"};
        Integer unu = new Integer(1), cnt;
        for (int i=0;i<d.length;i++) {
             if ( (cnt= (Integer)dic.get (d[i])) ==null) {
                dic.put (d[i],unu);
            } else {
                int nr = cnt.intValue();
                dic.put (d[i], new Integer (nr+1));
            }
        }
    System.out.println (dic);
    }
}
