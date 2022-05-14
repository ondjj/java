package sec05.exam04;

public class Singleton {
	private static Singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}

}
