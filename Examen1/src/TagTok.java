import java.util.StringTokenizer;

public class TagTok {
	private StringTokenizer token;
	private int indexMod;
	private String nextToken;

	public TagTok(String xml) {
		token = new StringTokenizer(xml, "</>", true);

	}

	public String next() {

		if (token.hasMoreTokens() == false)
			return null;
		StringBuffer s = new StringBuffer();
		nextToken = token.nextToken();
		if (nextToken.length() != 1) {
			this.indexMod = 3;
			return nextToken;
		}
		this.indexMod = 1;
		s.append(nextToken);
		nextToken = token.nextToken();
		if (nextToken.equals("/"))
			this.indexMod = 2;
		s.append(nextToken);
		nextToken = token.nextToken();
		s.append(nextToken);
		if (this.indexMod == 2)
			s.append(token.nextToken());
		return s.toString();
	}
	public boolean hasNext() {
		return token.hasMoreTokens();
	}

	public int getType() {
		return this.indexMod;
	}
}