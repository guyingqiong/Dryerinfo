package com.Dryer.wsServer;
import javax.xml.ws.Endpoint;
public class RunService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dryer Web Service started.");
		  Endpoint.publish("http://localhost:8080/wsServerforDryer", new DryerInfo());
	}

}
