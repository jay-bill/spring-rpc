package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.BurlapService;

public class Client {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		BurlapService burlap = (BurlapService)app.getBean("clientBurlap");
		burlap.helloWorld();
	}
}
