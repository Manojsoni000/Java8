package learn.staticmethod;

public interface Animal {
	public abstract void eat();

	public static void thisIsStaticMethod1(){
		System.out.println("Hy this is me Static Method 1");
		}
	
	public static void thisIsStaticMethod2(){
		System.out.println("Hy this is me Static Method 2");
		}
}
