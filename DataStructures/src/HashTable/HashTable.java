package HashTable;

public class HashTable<X, Y> {

	private final int TABLE_SIZE = 100;

	@SuppressWarnings("unchecked")
	private Record<X, Y> table[] = new Record[TABLE_SIZE];

	public void put(X key, Y data) {
		int keyCode = key.hashCode();
		int step = 0;
		int slot = hash(keyCode, step);
		while (!isEmpty(slot)) {
			hash(keyCode, ++step);
		}
		table[slot] = new Record<X, Y>(key, data);
	}

	public boolean isEmpty(int slot) {
		return table[slot] == null;
	}

	public int hash(int keyCode, int step) {

		if (step == 0)
			return keyCode % TABLE_SIZE;
		else
			return (keyCode % TABLE_SIZE + step * step) % TABLE_SIZE;

	}

	public Y get(X key) {
		int keyCode = key.hashCode();
		int step = 0;
		int slot = hash(keyCode, step);
		while (table[slot] != null && !table[slot].getKey().equals(key)) {
			slot = hash(keyCode, ++step);
		}
		if (table[slot] != null)
			return table[slot].getData();
		return null;
	}

	public static void main(String[] args) {
		HashTable<Integer, String> ht = new HashTable<Integer, String>();

		ht.put(2, "amar");
		ht.put(1, "sandhu");

		System.out.println(ht.get(1));
	}

}