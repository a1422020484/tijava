package tjjava.eighten;

import java.io.*;

public class RandomAccessFileTest {

	public static void main(String[] args) throws Exception {
		RandomAccessFile file = new RandomAccessFile("E:\\YangOffice\\tijava\\tijava\\BufferedInputFile.txt", "rw");
		file.seek(200);
		file.write("hello world".getBytes());
		file.close();
	}

}
