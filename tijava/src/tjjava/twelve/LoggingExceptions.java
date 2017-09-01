package tjjava.twelve;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {
//	创建了一个String参数县关联的Logger对象，这个对象会将其发送到System.err
	private static Logger logger = Logger.getLogger("LoggingException");
	public LoggingException(){
		StringWriter traceStringWriter = new StringWriter();
		printStackTrace(new PrintWriter(traceStringWriter));
		logger.severe(traceStringWriter.toString());
	}
}

public class LoggingExceptions {

	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			// TODO Auto-generated catch block
			System.out.println("Caught " + e);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Caught " + e);
		}
	}
}
