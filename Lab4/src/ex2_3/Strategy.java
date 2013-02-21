package ex2_3;

/**
 * Enumera tipurile de strategii pentru containere
 * O alternativa la aceasta metoda de enumerare ar fi fost definirea
 * unor constante public static final pentru fiecare strategie. Aceasta
 * metoda insa este mai potrivita - este type-safe, mai intuitiva
 * si beneficiaza de anumite proprietati care pot fi folositoare in multe situatii:
 * http://download.oracle.com/javase/tutorial/java/javaOO/enum.html 
 * @author marius-andrei
 *
 */
public enum Strategy {
	FIFO, LIFO
}
