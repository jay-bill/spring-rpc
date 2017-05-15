package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.HessionService;

public class Client {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext(  
                "applicationContext.xml");  
  
        // 获得客户端的Hessian代理工厂bean  
		HessionService hession = (HessionService) contex.getBean("clientHession");  
        hession.helloWorld();
	}

}
