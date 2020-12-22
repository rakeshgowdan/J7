package com.ty.TwR;

import java.io.FileOutputStream;

public class DriverExceptions {
public static void main(String[] args) {
	
	try(FileOutputStream fileOutputStream =new FileOutputStream("demo.txt")){      
		String msg = "Welcome to java!! this is an example for Try With Resources";      
		byte byteArray[] = msg.getBytes(); //converting string into byte array      
		fileOutputStream.write(byteArray);  
		System.out.println("Message written to file successfuly!");      
		}catch(Exception exception){  
		       System.out.println(exception);  
		}   
}
}
