package polyspring;

public class HelloBean2 implements HelloBean {
	
	public HelloBean2() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean2()");
	}
	
	public void sayHello(String name) {
		System.out.println("Hello" + name);
	}
}
