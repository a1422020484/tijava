package tjjava.six;

public class StringTest {
	
	/**
	 * @author yang
	 * @time 2016年11月23日下午2:17:10
	 * @return_type void
	 * util必须初始化
	 */
	protected void utilProtected(){
//		String utilP;
		String utilPub = "kk";
		String utilPro = null;
//		System.out.println("" + utilP);
		System.out.println("utilPub:" + utilPub + "lenght:"+utilPub.length());
		System.out.println("utilPro:" + utilPro + "lenght:"+utilPro.length());
	}
	public static void main(String[] args) {
		
		StringTest st = new StringTest();
		st.utilProtected();
	}
}
