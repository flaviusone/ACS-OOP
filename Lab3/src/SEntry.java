/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.AbstractMap.SimpleEntry;
/**
 *
 * @author student
 */
public class SEntry extends SimpleEntry {
    
    public SEntry(Object key, Object value){
      super (key,value);
    }
    
    @Override
    public boolean equals(Object o){
        SEntry e=(SEntry)o;
        return getKey().equals(e.getKey());
        
    }
    
}
