import java.io.IOException;

public class Clasa_Principala {

	/**
	 * @param args
	 */
	public static void main(String args[]) throws IOException {
		/*TagTok t = new TagTok("<cafea><nume>Amigo</nume><pret>10</pret></cafea>");
		while (t.hasNext()) {
			System.out.println(t.next() + "\t\t" + t.getIndexMod());
		}
		*/
		
		MLParser t = new MLParser("<cafea><nume>Amigo</nume><pret>10</pret></cafea>");
		String tokenul;
		int j=8;
	while((tokenul = t.next())!= null)
		System.out.println(tokenul + "  " + t.getType()
				);
		 
				
		
	}
	
}
