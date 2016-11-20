package org.acme.ws;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(
        portName = "HelloWorldPort",
        serviceName = "HelloWorldService",
        targetNamespace = "http://acme.org/wsdl")
public class HelloWorld {
	
	public String helloName(String name){ 
		
		return "Hello there " + name;  
		
	} 
	 
	 

}
