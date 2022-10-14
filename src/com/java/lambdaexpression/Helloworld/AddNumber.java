package com.java.lambdaexpression.Helloworld;

@FunctionalInterface
interface Add {
	void addition(int a, int b);
}

public class AddNumber {
	public static void main(String[] args) {
		Add add = (a, b) -> {
			System.out.println(a + b);

		};
		add.addition(5, 7);
	}

}
