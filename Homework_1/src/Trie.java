public class Trie {
	private Node root;

	public Trie() {
		root = new Node(' ',null);
	}

	public void insert(String s,int[] val)
	// TODO de modificat pentru adaugat si valori ?
	{
		Node current = root;
		if (s.length() == 0) // string gol
			current.marker = true;
		for (int i = 0; i < s.length(); i++) {
			Node child = current.subNode(s.charAt(i));
			if (child != null) {
				current = child;
			} else {
				current.child.add(new Node(s.charAt(i),val));
				current = current.subNode(s.charAt(i));
			}
			if (i == s.length() - 1)
				current.marker = true;
		}
	}

	public int[] get(String s)
	// TODO o sa returneze ceva probabil
	// nu boolea
	{
		Node current = root;
		while (current != null) {
			for (int i = 0; i < s.length(); i++) {
				if (current.subNode(s.charAt(i)) == null)
					return null;
				else
					current = current.subNode(s.charAt(i));
			}
			if (current.marker == true)
				return current.val;
			else
				return null;
		}
		return null;
	}
}
