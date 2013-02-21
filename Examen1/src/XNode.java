import java.util.List;


public interface XNode {
	public void Adaugare_fiu(XNode x);
	public String Valoare_nod();
	public int Tip_nod();
	public XNode Parinte();
	public void set_parinte(XNode x);
	public List Fii();
	
}
