import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 
 * Clasa Main
 * 
 * @author Flaviusone Yao Ming
 * 
 */
public class Main {
	public static int[] addElement(int[] org, int added) {
		int[] result = Arrays.copyOf(org, org.length + 1);
		result[org.length] = added;
		return result;
	}

	public static int[] Or(int[] a, int[] b) {
		if (a == null)
			if (b == null)
				return null;
			else
				return b;
		else if (b == null)
			return a;

		int[] result = a.clone();
		boolean ok = false;
		for (int i = 0; i < b.length; i++) {
			ok=false;
			for (int j = 0; j < result.length; j++)
				if (b[i] == result[j])
					ok = true; // adica exista deja
			if (!ok)
				result = addElement(result, b[i]);
		}

		return result;
	}

	public static int[] And(int[] a, int[] b) {

		if (b == null || a == null) {
			return null;
		}
		
		int[] result = new int[0];

		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < b.length; j++)
				if (a[i] == b[j])
					result = addElement(result, a[i]);

		return result;
	}

	public static String Parsare(String line, Dictionary d) {
		StringBuffer result = new StringBuffer();
		Stack<String> Operatori = new Stack();
		Stack<int[]> Numere = new Stack();
		StringTokenizer st = new StringTokenizer(line, "( )", true);
		String s = null;
		int[] a, b;
		while (st.hasMoreTokens()) {
			s = st.nextToken();
			if (s.equals("(") || s.equals(" ")) {
				// do nothing
			} else if (s.equals("and")) {
				Operatori.add("and");
				// add and
			} else if (s.equals("or")) {
				Operatori.add("or");
				// add or
			} else if (s.equals(")")) {
				a = Numere.pop();
				b = Numere.pop();
				if (Operatori.pop().equals("and"))
					Numere.push(And(a, b));
				else
					Numere.push(Or(a, b));
				// do serious shit
			} else {
				Numere.add(d.Nanu.get(s));
				// add to stack
			}

		}

		int[] asd = Numere.pop();
		if (asd==null) return null;
		for (int i = 0; i < asd.length; i++) {
			result.append(asd[i]);
			//if(i !=(asd.length-1) )
			result.append(" ");
		}
		return result.toString();
	}

	public static void main(String[] args) throws IOException {
		Dictionary d = new Dictionary(args[0]);
		//System.out.println("Avem " + d.getnumEntries()
			//	+ " intrari in dictionar");

		java.io.BufferedReader stdin = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		String line = stdin.readLine();
		
		String output;
		while (!(line.equals("exit"))) {
			
			output = Parsare(line, d);
			if (output==null){
				System.out.printf("\n");
			}
			else{
				System.out.printf("%s\n",output);
			}
			line = stdin.readLine();
			
			
		}
	}

}
