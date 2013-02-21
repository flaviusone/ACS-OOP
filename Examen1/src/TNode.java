import java.util.Enumeration;

import javax.swing.tree.DefaultMutableTreeNode;

public class TNode extends DefaultMutableTreeNode {

	public TNode(String string) {
		super();
		setUserObject(string);
	}
	public String toStringAll() {
		return toStringHelper(this, 0);
	}
	private static String toStringHelper(TNode t, int indent) {
		String ceva="";
		for (int i = 0; i < indent; i++)
			ceva += "    ";
		ceva += t + "\n";

		Enumeration<TNode> e = t.children();
		while (e.hasMoreElements()) {
			ceva += toStringHelper(e.nextElement(), indent+1);

		}
		return ceva;
	}
}
