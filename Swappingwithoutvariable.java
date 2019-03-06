package com.javaprogram;

import java.util.Scanner;

public class Swappingwithoutvariable {

	public static void main(String[] args)
	{
		int a,b;
		System.out.println("Enter values of a and b:");
		  Scanner in=new Scanner(System.in);
		  a=in.nextInt();
		  b=in.nextInt();
		  System.out.println("Before swapping a and b:" +a +b);
		  a=a+b;
		  b=a-b;
		  a=a-b;
		  System.out.println("After swapping a and b:"+a +b);
		  
		
	}

}
