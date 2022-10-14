package com.java.lambdaexpression.Helloworld;

import java.util.ArrayList;
import java.util.Collections;

//For Using Lambda Expression we don't need to create this implementation class

/* class Mycomparator implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {
		/*
		  { if(I1>I2) { return -1; }else if(I1<I2) { return 1; }else { return 0; } }
		 */
		// we can replace whole process in a single line
	/*	{
			return (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0;
		}
	}

}*/

public class Compare {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(34);
		list.add(03);
		list.add(43);
		list.add(54);
		list.add(76);
		list.add(33);
		list.add(23);
		list.add(233);

		System.out.println("Before Sorting");
		System.out.println(list);

		Collections.sort(list);

		System.out.println("After Sorting");
		System.out.println(list);
		
		//Without Lambda Expression
		/*Collections.sort(list, new Mycomparator());
		System.out.println("After Sorting own Customized sorting");
		System.out.println(list);  */

		// By using Lambda Expression
		System.out.println("By Using Lambda Expression");
		Collections.sort(list, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		System.out.println(list);
		
	}
}
