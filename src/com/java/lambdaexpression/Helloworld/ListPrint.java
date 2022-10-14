package com.java.lambdaexpression.Helloworld;

import java.util.ArrayList;
import java.util.List;

//Lambda Expression Example: Foreach Loop

public class ListPrint {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Sohan");
		list.add("Manoj");

		list.forEach(

				(n) -> System.out.println(n));
	}
}
