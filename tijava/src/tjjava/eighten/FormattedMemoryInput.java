package tjjava.eighten;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class FormattedMemoryInput {

	public static void main(String[] args) throws Exception {
		try {
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("BufferedInputFile.java").getBytes()));
			while (in.read() != -1) {
				System.out.println((char) in.readByte());
			}
			in.close();
		} catch (Exception e) {
			System.out.println("end stream ----------- main");
		}
		TestEOF.read();
	}
}

class TestEOF {
	public static void read() throws Exception {
		DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("BufferedInputFile.java").getBytes()));
		while (in.available() != 0) {
			System.out.println((char) in.readByte());
		}
		System.out.println("end stream ----------- TestEOF read()");
		in.close();
	}
}