package tjjava.nineteen;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

public class Reflection {
	public static Set<String> analyze(Class<?> enumClass) {
		System.out.println(" --- analyzing " + enumClass + " ----- ");
		System.out.println("Interfaces:");
		for (Type t : enumClass.getGenericInterfaces()) {
			System.out.println(t);
		}

		System.out.println("Base : " + enumClass.getSuperclass());

		System.out.println("Methods");

		Set<String> methods = new TreeSet<String>();
		for (Method m : enumClass.getMethods()) {
			methods.add(m.getName());
		}

		System.out.println(methods);
		return methods;

	}

	public static void main(String[] args) {
		Set<String> exploreMethods = analyze(Explore.class);
		Set<String> enumMethods = analyze(Enum.class);
//		System.out.println("Explore.containAll(Enum) ?" + exploreMethods.contains(enumMethods));
		System.out.println("Explore.removeAll(Enum):");
		exploreMethods.removeAll(enumMethods);
		System.out.println(exploreMethods);
		// OSExecute.command("javap Explore");
	}
}

enum Explore {
	HERE, THERE
}