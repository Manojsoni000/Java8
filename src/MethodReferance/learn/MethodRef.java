package MethodReferance.learn;

public class MethodRef {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		Demo demo = MethodRef::saySomething;
		demo.message();
	}
}
