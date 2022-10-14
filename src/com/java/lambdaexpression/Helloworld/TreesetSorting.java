package com.java.lambdaexpression.Helloworld;

import java.util.TreeSet;

public class TreesetSorting {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);

		t.add(4);
		t.add(34);
		t.add(03);
		t.add(43);
		t.add(54);
		t.add(76);
		t.add(33);
		t.add(23);
		t.add(233);
		System.out.println(t);
	}
}
