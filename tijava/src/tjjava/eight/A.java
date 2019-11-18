package tjjava.eight;

public class A {
	
	public String name = "yangxp father";
	
	public String show(D obj) {
		return ("A and D");
	}

	public String show(A obj) {
		return ("A and A");
	}
	
	public static void main(String[] args) {
		A a1 = new A();  
        A a2 = new B();  
        B b = new B();  
        C c = new C();   
        D d = new D();   
        System.out.println(a1.show(b));   
        System.out.println(a1.show(c));    
        System.out.println(a1.show(d));     
        System.out.println(a2.show(b));     
        System.out.println(a2.show(c));     
        System.out.println(a2.show(d));     
        System.out.println(b.show(b));      
        System.out.println(b.show(c));      
        System.out.println(b.show(d));     
        System.out.println(b.showN(d));  
        System.out.println(a2.name);
        System.out.println(b.name);
	}
}

class B extends A {

	public String name = "yangxp son";
	
	public String show(B obj) {
		return ("B and B");
	}

	public String show(A obj) {
		return ("B and A");
	}
	
	public String show(C obj) {
		return ("B and C");
	}
	public String showN(A obj) {
		return ("N B and C");
	}
}

class C extends B {
}

class D extends B {
}