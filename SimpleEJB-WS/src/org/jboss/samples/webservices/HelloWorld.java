package org.jboss.samples.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.annotations.SchemaValidation;

@WebService(wsdlLocation="/WEB-INF/HelloWorld.wsdl")
@SchemaValidation
public class HelloWorld {
	
//	@WebMethod()
//	public String sayHello(@Size(max=5)String name, SomeRestrictedObject obj) throws BasicException {
//	    System.out.println("Hello: " + name);
//	    System.out.println("Number sent in is: " + obj.getSomeNumber());
//	    return "Hello " + name + "! " + obj.getSomeNumber();
//	}
	
	@WebMethod()
	public String sayGoodBye(String name, SomeRestrictedObject obj) throws BasicException {
	    System.out.println("Hello: " + name);
	    System.out.println("Number sent in is: " + obj.getSomeNumber());
	    return "Hello " + name + "! " + obj.getSomeNumber();
	}

	
	@WebMethod()
	public String multipleArgs(@WebParam(name="one") String one, 
		                       @WebParam(name="two") String two, 
		                       @WebParam(name="three")String three) {
		return "multiple args taken in" + one + two + three;
	}
}
