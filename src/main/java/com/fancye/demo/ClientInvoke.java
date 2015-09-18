/**
 * 
 */
package com.fancye.demo;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.MalformedURLException;

import redstone.xmlrpc.XmlRpcClient;
import redstone.xmlrpc.XmlRpcException;
import redstone.xmlrpc.XmlRpcFault;
import redstone.xmlrpc.XmlRpcSerializer;
import redstone.xmlrpc.XmlRpcServer;

/**
 * 客户端调用测试类
 * 
 * @author Fancye
 * @2015-9-18
 */
public class ClientInvoke {

	/**
	 * @param args
	 * @throws XmlRpcFault 
	 * @throws XmlRpcException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws XmlRpcException, XmlRpcFault, IOException {
//		XmlRpcClient client = new XmlRpcClient("http://localhost:8080/apache_cxf_spring/service/HelloServicePort?wsdl", true);
//		client.invoke("sayHi", new Object[]{"Fancye"});
		
//		XmlRpcClient client = new XmlRpcClient("http://jira.atlassion.com/RPC2", true);
//		Object token = client.invoke("jira1.login", new Object[] {"a", "b"});
//		client.invoke("jira1.logout", new Object[] { token });
		
//		XmlRpcClient client = new XmlRpcClient("http://localhost:8080/redstone-rpc/xml-rpc", false);
//		Object token = client.invoke("RandomNumberGenerator.nextInt", new Object[] {10});
//		System.out.println(token);
//		client.invoke("SimpleDatabase.put", new Object[] {"a", "b"});
//		System.out.println(client.invoke("SimpleDatabase.get", new Object[] {"a"}));
		
		// 序列化
		Writer writer = new OutputStreamWriter(System.out);
		new XmlRpcSerializer().serialize("Fancye", writer);
		new XmlRpcSerializer().serialize(42, writer);
		writer.flush();
		
	}

}
