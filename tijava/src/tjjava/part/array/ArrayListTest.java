package tjjava.part.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import tjjava.part.MyTest;

public class ArrayListTest implements MyTest {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("Sr");
		List<String> l2 = new LinkedList<String>();
		l2.add("d");
		l1 = l2;
		System.out.println(l1);
		System.out.println(l2);
		
		ArrayList<String> al2 = new ArrayList<String>();
		LinkedList<String> al3 = new LinkedList<String>();
//		al2 = al3;
	}
	
	public static void main(String[] args) {
		ArrayListTest at = new ArrayListTest();
		at.play();
	}
}
