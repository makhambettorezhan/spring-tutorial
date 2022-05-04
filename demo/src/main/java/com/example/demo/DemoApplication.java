package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		//Client client = (Client) context.getBean("client");
		//client.showMsg();
		//System.out.println(client.getSomeList());

		Client client1 = (Client) context.getBean("client1");
		client1.action();
		Client client2 = (Client) context.getBean("client2");
		client2.action();
	}

}
