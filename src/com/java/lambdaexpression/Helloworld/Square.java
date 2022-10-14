package com.java.lambdaexpression.Helloworld;

interface Inter {
	int sqre(int a);
}

//without Lambda
/* class Demo implements Inter {

	@Override
	public int sqre(int a) {
		return a * a;
	}
} */

public class Square {
	public static void main(String[] args) {
		//Without Lambda
		/*
		Demo d1 = new Demo();
		System.out.println(d1.sqre(2));
		System.out.println(d1.sqre(3));
		System.out.println(d1.sqre(4));
		System.out.println(d1.sqre(5));
		System.out.println(d1.sqre(6));
	*/
		 
		//With Lambda
		
		Inter sre = (a)->{
			return a*a;
		};
	System.out.println(sre.sqre(8));
	}
	
}
