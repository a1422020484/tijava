package tjjava.ten;

public class DotThis {

	void f(){
		System.out.println("DotThis.f()");
	}
	public class Inner {
		public DotThis outer(){
			return DotThis.this;
		}
	}
	public Inner inner(){
		return new Inner();
	}
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti1 = dt.inner();
		Inner dti2 = dt.inner();
		DotThis.Inner dti3 = dt.new Inner();
//		Inner dti4 = new Inner();
		dti1.outer().f();
		dti2.outer().f();
		dti3.outer().f();
	}

}
