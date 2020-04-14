package com.example.demo.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener{
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Servlet Context Destoryed");
	}

	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Servlet Content Initialized");
	}
}
