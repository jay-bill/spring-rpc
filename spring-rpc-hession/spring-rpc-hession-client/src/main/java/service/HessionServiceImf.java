package service;

import org.springframework.stereotype.Component;

@Component("hessionService")
public class HessionServiceImf implements HessionService {

	public void helloWorld() {
		System.out.println("你好，世界！");
	}

}
