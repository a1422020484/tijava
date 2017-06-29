package tjjava.ten;

interface SelectorMy {
	void next();

	Object getNext();

	Boolean end();
}

public class SequenceMy {

	private static Object[] items;
	private int next = 0;

	SequenceMy(int size) {
		items = new Object[size];
	}

	public void add(int value) {
		items[next++] = value;
	}

	public class SequenceSelectorMy implements SelectorMy {

		private int i = 0;

		@Override
		public void next() {
			i++;
		}

		@Override
		public Object getNext() {
			return items[i];
		}

		public Boolean end() {
			return i == items.length;
		}

	}

	public SelectorMy selector() {
		return new SequenceSelectorMy();
	}

	public static void main(String[] args) {
		SequenceMy sequenceMy = new SequenceMy(10);
		for (int i = 0; i < items.length; i++) {
			sequenceMy.add(i);
		}
		SelectorMy selectorMy = sequenceMy.selector();
		while (!selectorMy.end()) {
			System.out.println(selectorMy.getNext());
			selectorMy.next();
		}
	}
}
