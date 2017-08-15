package tjjava.eighten;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * @author yangxp
 * @date 2017年8月15日 下午3:57:57
 *       <p>
 *       文本文件输出的快捷方式
 */
public class FIleOutputShortcut {

	private static String fileInput = "FileInputShortcut.txt";
	private static String fileOutput = "FileOutputShortcut.txt";

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(fileInput)));
		PrintWriter out = new PrintWriter(fileOutput);
		int lineCount = 1;
		String s;
		while ((s = in.readLine()) != null) {
			out.println(lineCount++ + " " + s);
		}
		out.close();
		System.out.println(BufferedInputFile.read(fileOutput));
	}

}
