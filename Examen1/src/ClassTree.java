import java.io.*;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class ClassTree {
	public TNode root;
	public ClassTree()
	{
		root=null;
	}
	public ClassTree(Dictionary dict)
	{
		
		Hashtable<String,TNode> h = new Hashtable<>();
		Enumeration<String> e =dict.keys();
		//System.out.println(dict);
		while(e.hasMoreElements()){
			String copil = e.nextElement();
			h.put(copil,new TNode(copil));
		}
		h.put("Object",	new TNode("Object"));
		e=dict.keys();
		while(e.hasMoreElements()){
			String copil = e.nextElement();
			TNode tcopil = h.get(copil);
			TNode parinte=h.get(dict.get(copil));
			parinte.add(tcopil);
		}
		//creeaza arbore in functie de dict
		root = h.get("Object");
	}
	
	
}
