package tjjava.six;

public class ChocolateChip2 extends Cookie {

//	ChocolateChip2(){
//		System.out.println("ChocolateChip2 constructor!");
//	}
//	子类的构造方法总是首先调用父类的构造方法，如果子类的构造方法中没有明显的指明使用父类的那个构造方法，子类就去调用父类默认的无参构造方法。
//	然而本例中，父类重写了构造方法，只有一个带参数的构造方法而没有无参构造方法，所以子类需要在自己的构造方法中显示的调用父类带参构造方法
	ChocolateChip2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void chomp(){
		bite();
		bitePublic();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "00";
		ChocolateChip2 cc = new ChocolateChip2(name);
		cc.chomp();
	}

}
