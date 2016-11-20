package org.acme.ws.next;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(
        portName = "HelloWorld2Port",
        serviceName = "HelloWorld2Service")
public class HelloWorld2 {
	
	public String helloName(String name){ 
		
		return "Hello there " + name + " from HelloWorld2";  
		
	} 
	 
	 

}
