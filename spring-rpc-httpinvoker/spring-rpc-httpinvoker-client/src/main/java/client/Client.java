package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.HttpInvokerService;

public class Client {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		HttpInvokerService service = (HttpInvokerService) app.getBean("clientHttpInvoker");
		service.helloWorld();
	}
}
