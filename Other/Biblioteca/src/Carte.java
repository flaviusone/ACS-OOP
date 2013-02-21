import java.util.Scanner;


public class Carte {
	public String titlu, autor,editura;
	public int numarPagini;
	
	public Carte CitireCarte(){
		Scanner s = new Scanner(System.in);
		System.out.println("Titlu Carte:");
		this.titlu=s.nextLine();
		System.out.println("Autor:");
		this.autor = s.nextLine();
		System.out.println("Editura:");
		this.editura = s.nextLine();
		System.out.println("Numar Pagini:");
		this.numarPagini = s.nextInt();
		while(this.numarPagini == 0)
		{
			System.out.println("Sunt 0 pagini");
			this.numarPagini = s.nextInt();
		}
		s.nextLine();
		//s.close();
		
		return this;
	}
	
	public void AfisareCarte(Carte x){
		System.out.println("Titlu Carte:" + x.titlu);
		System.out.println("Autor:" + x.autor);
		System.out.println("Editura:" + x.editura);
		System.out.println("Numar Pagini:" + x.numarPagini);
	}
	
	public void AfisareCarte2(Carte x){
		System.out.println("Titlu Carte:" + x.titlu.toUpperCase());
		System.out.println("Autor:" + x.autor);
		System.out.println("Editura:" + x.editura.toLowerCase());
		System.out.println("Numar Pagini:" + x.numarPagini);
	}
}

