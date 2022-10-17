package DefaultMethod.learn;

interface First {

	default void message() {
		System.out.println("Hello, this is default method");
	}

	void say(String msg);
}

public class DfltMain implements First {

	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DfltMain dm = new DfltMain();
		dm.message();
		dm.say("hiii !");
	}
}
