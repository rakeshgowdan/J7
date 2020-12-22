package Com.ty.Logging;

import java.util.logging.Level;

public class Driver {
public static void main(String[] args) {
	
	try {
		LoggingExample logs=new LoggingExample("logDetails.txt");
		logs.log.setLevel(Level.WARNING);
		
		logs.log.info("information Message");
		logs.log.warning("Warning message");
		logs.log.severe("Severe message");
	}
	catch (Exception e) {
		System.out.println("something went wrong!! "+e);
	}
}
}
