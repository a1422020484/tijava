package tjjava.eighten;

import java.io.StringReader;

/**
 * @author yangxp
 * @date 2017年8月15日 下午3:29:37
 *       <p>
 *       内存输入 StringReader
 */
public class MemoryInput {

	public static void main(String[] args) throws Exception {
		StringReader in = new StringReader(BufferedInputFile.read("BufferedInputFile.java"));
		int c;
		while ((c = in.read()) != -1) {
			System.out.println((char) c);
		}
		in.close();
	}

}
