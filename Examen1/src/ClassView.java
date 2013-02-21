import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTree;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class ClassView extends JFrame{
	public ClassView()
	{
		TNode bla=null;
		//setLayout(new FlowLayout());
		setSize(300,300);
		setLayout(new FlowLayout());
		final JTextField field= new JTextField();
		field.setText("Decitit");
		field.setSize(100, 100);
		this.add(field);		
		
		
		
		JTree jtree=new JTree(bla);
		
		
		this.add(jtree);
		JButton buton=new JButton();
		buton.setSize(50, 50);
		this.add(buton);
		buton.setText("aaaaaa");
		
		
		
		this.setVisible(true);
		buton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ClassRel Nimic=new ClassRel(new File(field.getText()));
				ClassTree tree=new ClassTree(Nimic.dict);
				JTree jtree=new JTree(tree.root);
				ClassView.this.add(jtree);
				TreeList list = new TreeList();
				list.setRoot(tree.root);
				ClassView.this.add(list);
				
				ClassView.this.revalidate();
			}
		});
	}
	
}
