package tjjava.nine;

import java.util.Arrays;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor{
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}

class Splitter extends Processor{
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}

/**
 * @author Administrator
 *	也是策略模式的一种体现：创建一个能够根据所传参数对象的不同而具有不同行为的方法被称为策略模式
 */
public class Apply {

	public static String s = "Disagreement with beliefs is by definition incorrect";
	public static void process(Processor p,String s){
		System.out.println("using processor " + p);
		System.out.println(p.process(s));
	}
	public static void main(String[] args) {
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Splitter(),s);
	}

}
