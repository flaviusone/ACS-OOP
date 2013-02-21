import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyHashMapImpl<K, V> implements MyHashMap<K, V> {
	int size = 0;
	ArrayList<BucketImpl> bucket_array;

	public MyHashMapImpl(int NUM_BUCKETS) {

		bucket_array = new ArrayList<BucketImpl>(NUM_BUCKETS);
		// adaugam elemente in vector pentru a putea fi accesate
		for (int i = 0; i < NUM_BUCKETS; i++) {
			BucketImpl a = new BucketImpl();
			bucket_array.add(a);
		}
	}

	@Override
	public V get(K key) {
		int i = translate(key); // index din bucket
		Iterator<EntryImpl> iterator = bucket_array.get(i).list.iterator();
		while (iterator.hasNext()) {
			EntryImpl entry = (EntryImpl) iterator.next();
			if (entry.getKey() == key)
				return entry.getValue();
		}
		return null;
	}

	@Override
	public V put(K key, V value) {
		int i = translate(key); // index din bucket
		LinkedList<EntryImpl> temp_list = bucket_array.get(i).list;
		for (int j = 0; j < temp_list.size(); j++) {
			// daca am casit cheia inlocuiesc value si returnez vechiul value
			if (temp_list.get(j).getKey() == key) {
				// salveaza valoare si add
				V tmp_val = temp_list.get(j).getValue();
				temp_list.get(j).value = value;
				return tmp_val;
			}
		}
		EntryImpl entry = new EntryImpl(key, value);
		bucket_array.get(i).list.add(entry);
		size++;
		// daca nu am gasit cheia o adaug
		return null;
	}

	@Override
	public V remove(K key) {

		int i = translate(key); // index din bucket
		LinkedList<EntryImpl> temp_list = bucket_array.get(i).list;
		for (int j = 0; j < temp_list.size(); j++) {
			if (temp_list.get(j).getKey() == key) {
				// salveaza valoare si remove
				V tmp_val = temp_list.get(j).getValue();
				temp_list.remove(j);
				size--;
				return tmp_val;
			}
		}
		return null;
	}

	/**
	 * Translateaza hashcode pentru hashcode de la Key
	 * 
	 * @param cheia
	 *            pentru aflat cod translatat
	 * @return codul translatat obitnut din hashCode mod lungime lista_bucket
	 */
	public int translate(K key) {
		if (bucket_array.size() != 0) {
			// daca lungime de bucket_array!=0 return hashCode mod lungime
			return (Math.abs(key.hashCode()) % bucket_array.size());
		}
		return 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public List<? extends MyHashMap.Bucket<K, V>> getBuckets() {
		return bucket_array;
	}

	public class BucketImpl implements Bucket<K, V> {
		LinkedList<EntryImpl> list = new LinkedList<EntryImpl>();

		@Override
		public List<? extends MyHashMap.Entry<K, V>> getEntries() {
			return list;
		}

	}

	public class EntryImpl implements Entry<K, V> {
		private K key;
		private V value;

		public EntryImpl(K key, V value) {
			this.key = key;
			this.value = value;
		}

		// check
		@Override
		public K getKey() {
			return this.key;
		}

		// check
		@Override
		public V getValue() {
			return this.value;
		}

	}

}
