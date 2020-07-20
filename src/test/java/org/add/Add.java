package org.add;

import java.util.Scanner;

public class Add {
	
	public void addition()
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers to be added ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
	 System.out.println("The result is "+c);
	}
	
	public static void main(String args[]) {

		Add a=new Add();
		a.addition();
	}

}
