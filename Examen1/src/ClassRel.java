import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class ClassRel {
	Dictionary<String, String> dict = new Hashtable<>();
	public ClassRel(File file)
	{
		try {
			this.dict=CreazaDict(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Dictionary CreazaDict(File file) throws IOException {
		Hashtable<String, String> d = new Hashtable<>();
		
		String parinte = "", copil = "";
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String linie;
		while ((linie = reader.readLine()) != null) {
			StringTokenizer token = new StringTokenizer(linie);
			String nextToken;
			while (token.hasMoreTokens()) {
				StringBuffer s = new StringBuffer();
				nextToken = token.nextToken();
				if (nextToken.equals("Class")) {
					s.append(nextToken + " "); // adauga class
					nextToken = token.nextToken(); // ------------- asta trebuie
													// adaugat la dict ca cheie
					copil = nextToken;
					s.append(nextToken + " "); // adauga ce urmeaza
					nextToken = token.nextToken();
					if (nextToken.equals("extends")) {
						s.append("\t" + nextToken + " "); // adauga extends
						nextToken = token.nextToken(); // ----------- asta
														// trebuie adaugat ca
														// value
						parinte = nextToken;
						s.append(nextToken); // adauga ce urmeaza
					} else {
						s.append("\textends ");
						s.append("Object");
						parinte = "Object";
					}
				}

				if (s.length() > 1) { //daca exista ceva
					// System.out.println(s);
					d.put(copil,parinte);
					if(d.get(parinte)==null && !parinte.equals("Object"))
						d.put(parinte,"Object");
				//	System.out.println("Added " + copil + " at key " + parinte);
				}
			}
		}
		
		reader.close();
		return d;
	}
}
