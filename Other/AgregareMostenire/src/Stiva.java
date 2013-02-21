
public class Stiva  extends Array{
	Array stack;
	int vf;
	public Stiva()
	{
		this(10);
	}
	public Stiva(int length)
	{
		stack = new Array(length);
		stack.set(0,1);
		vf = 0;
	}
	public void push(int i)
	{
		if ( stack.set(vf, i) != Array.ERROR)
			{	
				vf++;
				System.out.println("am adaugat in stiva pe " + i);
			}
		else
			System.out.println("Error adding value");
	}
	public int pop()
	//returneaza vf stiva
	{
		vf--;
		int val = stack.get(vf);
		if ( val != Array.ERROR)
		{
			System.out.println("am popuit pe " + val);
			return val;
		}
		else
			System.out.println("Error retrieving value");
		vf++;
		return -1;
	}
	public static void main (String args[])
	{
		Stiva stiva = new Stiva();
		//LOLOLOLOL
		System.out.println(stiva.stack);
		stiva.push(4);
		System.out.println(stiva.stack);
		System.out.println(stiva.pop());
		stiva.push(3);stiva.push(3);stiva.push(3);stiva.push(3);
		System.out.println(stiva.stack);
		stiva.pop();
		stiva.push(3);stiva.push(3);stiva.push(3);stiva.push(3);
		stiva.push(3);stiva.push(3);stiva.push(3);stiva.push(3);
		stiva.push(3);stiva.push(3);stiva.push(3);
		System.out.println(stiva.stack);
		//LOLOLOLOL
	}
}
