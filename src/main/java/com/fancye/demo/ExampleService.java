package com.fancye.demo;


import java.util.HashMap;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import redstone.xmlrpc.XmlRpcServlet;

/**
 * 初始化一个 Servlet 用于发布自定义的接口
 * 
 * @author Fancye
 * @2015-9-18
 */
public class ExampleService extends XmlRpcServlet {

	public void init( ServletConfig config ) throws ServletException{
		super.init(config);
		
		// 此处定义两个 Handler，第一个参数是 Handler 的别名，客户端调用方式查看 com.fancye.demo.ClientInvoke
		getXmlRpcServer().addInvocationHandler("SimpleDatabase", new HashMap());
		getXmlRpcServer().addInvocationHandler("RandomNumberGenerator", new Random());
	}
}
