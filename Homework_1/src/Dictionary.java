import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * Clasa ce defineste tipul dictionar
 * 
 * @author Andru
 *
 */
public class Dictionary {
	
	/**
	 * 
	 * Numarul de intrari din dictionar
	 * 
	 */
	private int numEntries = 0;
	Trie Nanu = new Trie();
	/**
	 * 
	 * Constructor pentru dictionar. Primeste ca parametru numele fisierului text (dictionarului) si il citeste linie cu linie
	 * 
	 * @param inputFile
	 * Numele fisierului text
	 */
	public Dictionary(String inputFile) {
		try{
			File dictFile = new File(inputFile);
			Scanner reader = new Scanner(dictFile);
			String strLine;
			String key,buffer;
			while (reader.hasNextLine()) {
				strLine = reader.nextLine(); // in strLine este linia curenta din dictionar
				//System.out.println(strLine);
				StringTokenizer st = new StringTokenizer(strLine);
				key = st.nextToken();
				int[] val = new int[st.countTokens()];
				int i=0;
				while(st.hasMoreTokens())
				{
					val[i] = Integer.parseInt(st.nextToken());
					i++;
				}
				Nanu.insert(key, val);
				numEntries++;
				// TO DO: aici veti procesa fiecare linie din dictionar
				// HINT: String tokenizer
			}
			reader.close();
		}catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	/**
	 * 
	 * Metoda ce returneaza numarul de intrari din dictionar
	 * 
	 * @return
	 * Numarul de intrari din dictionar
	 */
	public int getnumEntries() {
		return numEntries;
	}
}
