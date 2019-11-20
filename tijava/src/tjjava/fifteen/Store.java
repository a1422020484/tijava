package tjjava.fifteen;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Store extends ArrayList<Aisle> {
	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();
	private static AtomicInteger count = new AtomicInteger();

	public static void main(String[] args) {
		System.out.println(new Store(14, 5, 10));
		System.out.println(count);
	}

	public Store(int nAisle, int nShelves, int nProducts) {
		for (int i = 0; i < nAisle; i++) {
			add(new Aisle(nShelves, nProducts));
		}
	}

	public String toString() {
		StringBuilder result = new StringBuilder();

		for (Aisle a : this) {
			for (Shelf s : a) {
				for (Product p : s) {
					result.append(p);
					result.append("\n");
					count.incrementAndGet();
				}
			}
		}
		return result.toString();
	}

}

class Product {
	private final int id;
	private String decription;
	private double price;

	public Product(int IDnumber, String descr, double price) {
		this.id = IDnumber;
		this.decription = descr;
		this.price = price;
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", decription=" + decription + ", price=" + price + "]";
	}

	public void priceChange(double change) {
		price += change;
	}

	public static Generator<Product> generator = new Generator<Product>() {
		private Random rand = new Random(47);

		public Product next() {
			return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1000) + 0.99);
		}
	};
}

class Shelf extends ArrayList<Product> {
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}

class Aisle extends ArrayList<Shelf> {
	public Aisle(int nShelves, int nProducts) {
		for (int i = 0; i < nShelves; i++) {
			add(new Shelf(nProducts));
		}
	}
}

class CheckoutStand {

}

class Office {

}
