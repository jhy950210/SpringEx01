package polyspring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ApplicationMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 미리 생성자를 호출
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:polyspring/context.xml");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:polyspring/context.xml");
		ctx.refresh();
		
		HelloBean helloBean = (HelloBean)ctx.getBean("helloBean1");
		helloBean.sayHello("홍길동");
		
		helloBean = (HelloBean)ctx.getBean("helloBean2");
		helloBean.sayHello("박문수");
		ctx.close();
	}

}
