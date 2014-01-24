package org.jboss.example.client.clientsample;

import org.jboss.example.client.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        HelloWorldService service1 = new HelloWorldService();
	        System.out.println("Create Web Service...");
	        HelloWorld port1 = service1.getHelloWorldPort();
	        System.out.println("Call Web Service Operation...");
	        SomeRestrictedObject obj = new SomeRestrictedObject();
	        obj.setSomeNumber(10);
	        try {
	        System.out.println("Server response" + port1.sayGoodBye("mustafa", obj));
	        } catch (BasicException_Exception exception) {
	        	
	        }
//	        System.out.println("Server said: " + port1.multipleArgs(args[0],args[1],args[2]));
//	        System.out.println("Server said: " + port1.sayGoodBye(args[3],null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
