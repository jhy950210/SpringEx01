package basic;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloBean helloBean = new HelloBean1();
		helloBean.sayHello("홍길동");
		
		helloBean = new HelloBean2();
		helloBean.sayHello("박문수");
	}

}
