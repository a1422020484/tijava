package tjjava.eighten;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * @author yangxp
 * @date 2017年8月15日 下午3:55:57
 *       <p>
 *       <i>BufferedReader</i> <i>PrintWriter</i> BufferedWriter
 * 
 */
public class BasicFileOutput {

	static String fileInput = "BufferedInputFile.txt";
	static String fileOut = "BufferedOutputFile.txt";

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(fileInput)));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileOut)));
		int lineCount = 1;
		String s;
		while ((s = in.readLine()) != null) {
			System.out.println(lineCount++ + " " + s);
			out.print(s + "\r\n");// 写到文件里面
		}
		in.close();
		out.close();
		out.flush();
		System.out.println(BufferedInputFile.read(fileOut));
	}

}
