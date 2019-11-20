package tjjava.fifteen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * @author yangxp
 * 泛型的匿名内部类
 */
public class BankTeller {
	public static void server(Teller t, Customer c) {
		System.out.println(t + " servers " + c);
	}

	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);

		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator(), 4);

		for (Customer c : line) {
			server(tellers.get(rand.nextInt(tellers.size())), c);
		}
	}
}

class Customer {
	private static long counter = 1;
	private final long id = counter++;

	private Customer() {

	}

	public String toString() {
		return "Customer" + id;
	}

	public static Generator<Customer> generator() {
		return new Generator<Customer>() {
			public Customer next() {
				return new Customer();
			}
		};
	}
}

class Teller {
	private static long counter = 1;
	private final long id = counter++;

	private Teller() {

	}

	public String toString() {
		return "Teller" + id;
	}

	public static Generator<Teller> generator() {
		return new Generator<Teller>() {
			public Teller next() {
				return new Teller();
			}
		};
	}
}