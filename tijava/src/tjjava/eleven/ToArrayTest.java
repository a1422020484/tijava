package tjjava.eleven;

import java.util.ArrayList;
import java.util.List;

public class ToArrayTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("yang");
		list.add("faild");
		String resultStr = "";
		for(String unionName : list){
			resultStr += unionName + ",";
		}
		resultStr = resultStr.substring(0, resultStr.length() - 1); 
		System.out.println(resultStr);
	}

}
