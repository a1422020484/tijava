package tjjava.part.exception;

import java.util.Map;

public class Custom {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
//		Map<String,String> map = new HashMap<String,String>();
		Map<String,String> map = null;
		try {
			if(map==null){
				throw new MyException("message");
			}
			map.get("test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(map);
	}

	
}
