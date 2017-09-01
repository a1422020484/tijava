package tjjava.eighten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * @author yangxp
 * @date 2017年8月15日 下午3:29:12
 * 缓冲输入文件 BufferedReader
 */
public class BufferedInputFile1 {
	public static LinkedList<String> linkedList = new LinkedList<String>();

	public static void main(String[] args) throws Exception {
		reader("BufferedInputFile.java");
		for (String s : linkedList) {
			System.out.println(s);
		}
	}

	public static LinkedList<String> reader(String fileName) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		String sb;
		while ((sb = in.readLine()) != null) {
			linkedList.offerFirst(sb);
		}
		in.close();
		return linkedList;
	}
}
