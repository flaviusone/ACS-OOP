import java.util.Enumeration;
import java.util.Stack;


public class XEngine {
	public static void main(String[] args){
		String xml="<pc><nume>Asus</nume><pret>1800</pret></pc>";
		if(verify(xml))
			System.out.println("E valid");
		else 
			System.out.println("Nu e valid");
		XNode1 root = parse(xml);
		System.out.println(toStringHelper(root, 0));
		
	}
	private static String toStringHelper(XNode1 t, int indent) {
		String ceva="";
		for (int i = 0; i < indent; i++)
			ceva += "    ";
		ceva += t.Valoare + "\n";

		Enumeration<XNode1> e = t.children();
		while (e.hasMoreElements()) {
			ceva += toStringHelper(e.nextElement(), indent+1);

		}
		return ceva;
	}
	public static XNode1 parse(String xfile)
	{
		TagTok t = new TagTok(xfile);
		XNode1 root = new XNode1("nimic",1);
		//XNode1 root = new XNode1(t.next(),t.getType());
		XNode1 nod;
		while(t.hasNext())
		{
			String s = t.next();
			if(t.getType()==1){
				nod = new XNode1(s,1);
				root.set_parinte(nod);
				root=nod;
			}
			if(t.getType()==3){
				nod = new XNode1(s,3);
				root.set_parinte(nod);
				
			}
			if(t.getType()==2)
			{
				nod = new XNode1(s,2);
				root=root.Parinte();
				root.set_parinte(nod);
			}
		}
		return root;
	}
	static boolean verify(String xfile)
	{
		TagTok t = new TagTok(xfile);
		Stack<String> a=new Stack();
		while(t.hasNext())
		{
			String tok;
			tok=t.next();
			System.out.println(tok + " " + t.getType());
			if(t.getType()==1)
				a.push(tok);
			else if(t.getType()==2)
				if(tok.contains(a.peek().substring(1, a.peek().length())))
					a.pop();
				else
					return false;
		}
		if(a.isEmpty())
			return true;
		else
			return false;
		
	}
}


