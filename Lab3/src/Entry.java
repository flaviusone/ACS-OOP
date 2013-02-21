/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class Entry {
    
    Object key;
    Object value;
    Entry (Object key, Object val){
        this.key = key;
        this.value = val;
    }
    
   Object getKey(){	
       return key;
   }// are ca rezultat primul obiect (cheia)
   
   Object getValue(){
       return value;
   }// are ca rezultat al doilea obiect (valoare)
   
   Object setValue(Object obj){
       this.value = obj;
       return value;
   }// inlocuieste al doilea obiect cu "obj"
   
   public boolean equals(Object obj){
	   Entry e = (Entry) obj;
	   return e.getKey().equals(this.getKey());
	   //   return key.equals(obj);
   }// compara numai cheile din cele doua perechi
   public String toString(){
       return "( " + key + ", " + value + ")";
   }
    
}
