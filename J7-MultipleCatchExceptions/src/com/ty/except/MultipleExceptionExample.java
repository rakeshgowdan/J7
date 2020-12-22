package com.ty.except;


//You can use vertical bar (|) to separate multiple exceptions in catch block.
public class MultipleExceptionExample {
public static void main(String[] args) {
	try {
		int array[] = new int[10];    
        array[11] = 30/0;
		
	}
	catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		System.out.println("Something went wrong!! --> "+e);
	}
}
}
