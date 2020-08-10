package polyspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:polyspring/context.xml");
		
		// 인터페이스 이용
		HelloBean helloBean = (HelloBean)ctx.getBean("helloBean1");
		helloBean.sayHello("홍길동");
		
		helloBean = (HelloBean)ctx.getBean("helloBean2");
		helloBean.sayHello("박문수");
	}

}
