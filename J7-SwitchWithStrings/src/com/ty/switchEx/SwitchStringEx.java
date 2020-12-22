package com.ty.switchEx;

import java.util.Scanner;

public class SwitchStringEx {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String choice;
	System.out.println("pick a color");
	System.out.println("red\ngreen\nblue");
	choice=sc.next();
	switch(choice) {
	case "red":System.out.println("red");
				break;
	case "blue":System.out.println("blue");
				break;
	case "green":System.out.println("green");
				break;
	default :System.out.println("invalid pick!!");
	}
	sc.close();
}
}
