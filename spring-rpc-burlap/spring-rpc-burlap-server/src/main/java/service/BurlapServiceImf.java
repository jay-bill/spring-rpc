package service;

import org.springframework.stereotype.Component;

@Component("burlapService")
public class BurlapServiceImf implements BurlapService {

	public void helloWorld() {
		System.out.println("hello,尊敬的burlap使用者！");
	}

}
