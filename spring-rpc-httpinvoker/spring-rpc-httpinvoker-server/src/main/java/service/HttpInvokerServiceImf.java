package service;

import org.springframework.stereotype.Component;

@Component("httpInvokerService")
public class HttpInvokerServiceImf implements HttpInvokerService {

	public void helloWorld() {
		System.out.println("你好，尊敬的httpinvoker的用户！");
	}

}
