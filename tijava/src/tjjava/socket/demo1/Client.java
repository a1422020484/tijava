package tjjava.socket.demo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("localhost", 2225);
		OutputStream out = s.getOutputStream();
		out.write("client lai le".getBytes());

		InputStream in = s.getInputStream();
		byte[] buff = new byte[1024];
		int len = in.read(buff);
		String data = new String(buff, 0, len);
		System.out.println("server::" + data);
		s.close();
	}
}
