package polyspring;

public class HelloBean1 implements HelloBean {
	
	public HelloBean1() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean1()");
	}
	
	public void sayHello(String name) {
		System.out.println(name + "님 안녕하세요.");
	}
}
