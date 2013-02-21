import java.util.ArrayList;
import java.util.Random;

public class Mainclass {
	public static void main(String[] args) {
		Random rand = new Random();
		int lists_length = 5000;
		// /////////////////////////STUDENT/////////////////////////////////////
		ArrayList<Student> student_list = new ArrayList<>();
		MyHashMap<Student, Integer> smap = new MyHashMapImpl<Student, Integer>(
				20);
		for (int i = 0; i < lists_length; i++) {

			int x = rand.nextInt(5000); // generam numele
			int age = rand.nextInt(100); // generam varsta
			String name = "" + x;
			Student tmp_student = new Student(name, age); // generam obiect de
															// adaugat
			student_list.add(tmp_student);
		}
		for (int i = 0; i < student_list.size(); i++) // introducem in hashmap
		{
			int nota = rand.nextInt(11);
			smap.put(student_list.get(i), nota);
		}
		// ///////////////////////////LAZY_STUDENT///////////////////////////////////
		ArrayList<LazyStudent> lazy_student_list = new ArrayList<>();
		MyHashMap<LazyStudent, Integer> lsmap = new MyHashMapImpl<LazyStudent, Integer>(
				20);
		for (int i = 0; i < lists_length; i++) {

			int x = rand.nextInt(5000); // generam numele
			int age = rand.nextInt(100); // generam varsta
			String name = "" + x;
			LazyStudent tmp_student = new LazyStudent(name, age); // generam
																	// obiect de
																	// adaugat
			lazy_student_list.add(tmp_student);
		}

		for (int i = 0; i < lazy_student_list.size(); i++) // introducem in
															// hashmap
		{
			int nota = rand.nextInt(11);
			lsmap.put(lazy_student_list.get(i), nota);
		}

		// /////////////////////////////////////////////////////////////
		// /////teste pt cele 2 implementari
		long start = System.currentTimeMillis();
		for (int i = 0; i < 3000; i++) {

			smap.get(student_list.get(rand.nextInt(lists_length)));
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + " - timp Student");
		// ////
		start = System.currentTimeMillis();
		for (int i = 0; i < 3000; i++) {

			lsmap.get(lazy_student_list.get(rand.nextInt(lists_length)));
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + " - timp LazyStudent");
	}
}
