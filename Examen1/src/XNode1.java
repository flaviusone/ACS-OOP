import java.awt.Container;
import java.util.*;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class XNode1 extends DefaultMutableTreeNode implements XNode{
	
	@Override
	public void Adaugare_fiu(XNode x) {
		// TODO Auto-generated method stub
		this.add((MutableTreeNode) x);
	}

	@Override
	public String Valoare_nod() {
		// TODO Auto-generated method stub
		return this.Valoare;
	}

	@Override
	public int Tip_nod() {
		// TODO Auto-generated method stub
		return this.tip;
	}

	@Override
	public XNode1 Parinte() {
		return (XNode1) this.getParent();
		// TODO Auto-generated method stub
	}

	@Override
	public void set_parinte(XNode x) {
		// TODO Auto-generated method stub
		this.add((XNode1) x);
	}

	@Override
	public List Fii() {
		// TODO Auto-generated method stub
		ArrayList lista = new ArrayList();
		Enumeration<XNode> e = this.children();
		while(e.hasMoreElements())
			lista.add(e.nextElement());		
		return lista;
	}
	public int tip;
	public String Valoare;
	public XNode1(String s,int i){
	super();
	this.Valoare=s;
	//this.setUserObject(s);
	this.tip=i;
	}
}