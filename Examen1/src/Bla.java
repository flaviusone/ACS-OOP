import java.util.Iterator;
import java.util.Vector;

public class Bla extends Vector {
	public Iterator getIterator() {
		return new Iterator<String>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return Bla.this.size() > index;
			}

			@Override
			public String next() {
				return Bla.this.get(index).toString();
			}

			@Override
			public void remove() {
				Bla.this.remove(index);
			}
		};
	}
}