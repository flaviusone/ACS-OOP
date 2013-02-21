import java.util.Collection;
import java.util.LinkedList;

//clasa node
public class Node {
	char content;
	boolean marker;
	Collection<Node> child;
	int[] val;
	public Node()
	{
		content = (Character) null;
		marker = false;
		child = null;
		val = null;
	}
	public Node(char c,int[] valori)
	{
		child = new LinkedList<Node>();
		marker = false;
		content = c;
		val = valori;
	}
	public Node subNode(char c)
	{
		if ( child != null){
			for ( Node eachchild : child){
				if(eachchild.content == c)
				{
					return eachchild;
				}
			}
		}
		return null;
	}
}
