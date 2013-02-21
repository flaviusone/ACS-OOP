import java.util.Comparator;

 class ArrComp implements Comparator {
    	public int compare (Object a, Object b){
    		Object la[] = (Object[])a;         // o linie din a
    		Object lb[] = (Object[])b;         // o linie din b
    		Comparable ca =(Comparable)la[c];  // valoare din la[c]
    		Comparable cb =(Comparable)lb[c];  // c= nr coloana
    		return ca.compareTo(cb);
    	}
    }