package tjjava.eighten;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("E:/sourceTest/FileTest2.txt");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		bufferedOutputStream.write("hello world FileTest2".getBytes());
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
	}

}
