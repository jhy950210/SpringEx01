package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/context.xml");
		
		HelloBean1 helloBean1 = (HelloBean1)ctx.getBean("helloBean1");
		helloBean1.sayHello("홍길동");
		HelloBean2 helloBean2 = (HelloBean2)ctx.getBean("helloBean2");
		helloBean2.sayHello("박문수");
	}

}
