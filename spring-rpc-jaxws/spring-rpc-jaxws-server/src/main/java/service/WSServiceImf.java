package service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
@WebService(targetNamespace = "service")
@SOAPBinding
public class WSServiceImf implements WSService{

	public void helloWorld() {
		System.out.println("你好，尊敬的jax-ws用户！");
	}

}
