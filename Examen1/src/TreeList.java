import javax.swing.JList;


public class TreeList extends JList{
	void setRoot(TNode t){
		String [] lst = t.toStringAll().split("\n");
		this.setListData(lst);
	}
}
