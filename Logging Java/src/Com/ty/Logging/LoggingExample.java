package Com.ty.Logging;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingExample {

	public Logger log;
	FileHandler fileHandle;
	
	public LoggingExample(String fileName) throws IOException {
		File file=new File(fileName);
		if(!file.exists()) {
			System.out.println("-->file doesnot exist--file is being created");
			file.createNewFile();
			System.out.println("-->file created");
			
		}
		System.out.println("-->file exist--appending to existing file");
		fileHandle=new FileHandler(fileName,true);
		log=Logger.getLogger("test");
		log.addHandler(fileHandle);
		SimpleFormatter format=new SimpleFormatter();
		fileHandle.setFormatter(format);
		
	}
	
}
