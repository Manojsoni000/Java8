package com.java.lambdaexpression.Helloworld;

//Without Lambda

/*class MyRunnable implements Runnable {

	@Override
	public void run() {
		// With in this method code is run by child thread
		for (int i = 0; i <= 10; ++i) {
			System.out.println("Hello this is " + i + "Thread");
		}
	}

} */

public class ThreadLembda2 {
	public static void main(String[] args) {
		/*
		 * // Without Lambda MyRunnable mr = new MyRunnable(); // Here Main thread
		 * create child Thread Thread k = new Thread(mr); k.run();
		 * 
		 * // Now bellow for loop is executed by main thread for (int i = 0; i <= 10;
		 * ++i) { System.out.println("This is executed by main Thread"); }
		 * 
		 */

		// WithLambda
		Runnable r = () -> {
			for (int i = 0; i <= 10; ++i) {
				System.out.println("This is child Thread" + i);
			}
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; ++i) {
			System.out.println("This is run by main Thread" + i);
		}

	}

}
