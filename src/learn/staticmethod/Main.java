package learn.staticmethod;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.eat();
		Animal.thisIsStaticMethod1(); 
		Animal.thisIsStaticMethod2();
	}
}
