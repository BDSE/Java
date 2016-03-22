package HashTable;

public class Record<X, Y> {
	private X key;
	private Y data;

	public Record(X key, Y data) {
		this.key = key;
		this.data = data;
	}

	public X getKey() {
		return key;
	}

	public void setKey(X key) {
		this.key = key;
	}

	public Y getData() {
		return data;
	}

	public void setData(Y data) {
		this.data = data;
	}
}
