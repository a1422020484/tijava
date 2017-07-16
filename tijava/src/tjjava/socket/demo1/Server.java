package tjjava.socket.demo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10000);
		while (true) {
			Socket s = ss.accept();
			String ip = s.getInetAddress().getHostAddress();
			InputStream in = s.getInputStream();
			byte[] buff = new byte[1024];
			int len = in.read(buff);
			String data = new String(buff, 0, len);
			System.out.println(ip + "::" + data);

			OutputStream out = s.getOutputStream();
			out.write("server lai le".getBytes());
			s.close();
		}
	}
}
