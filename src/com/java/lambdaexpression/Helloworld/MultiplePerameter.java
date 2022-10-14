package com.java.lambdaexpression.Helloworld;

@FunctionalInterface
interface Addable {
	int add(int a, int b);
}

public class MultiplePerameter {
	public static void main(String[] args) {
		Addable ad = (a, b) -> {
			return a + b;
		};

		System.out.println(ad.add(43, 23));
		System.out.println(ad.add(73, 56));
	}
}
