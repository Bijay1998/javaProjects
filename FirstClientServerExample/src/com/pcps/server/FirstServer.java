/**
 * 
 */
package com.pcps.server;
import java.io.*;
import java.net.*;
/**
 * @author Dell
 *
 */
public class FirstServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			ServerSocket serversocket = new ServerSocket(5081);
			Socket socket = serversocket.accept();
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String msg = dis.readUTF();
			System.out.println("Message: " + msg);
			
			socket.close();
			serversocket.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
