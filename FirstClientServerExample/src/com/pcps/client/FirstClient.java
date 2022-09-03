/**
 * 
 */
package com.pcps.client;
import java.net.*;
import java.io.*;

/**
 * @author Dell
 *
 */
public class FirstClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Socket socket = new Socket("localhost", 5081);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("Welcome to PCPS!!!");
			dos.flush();
			dos.close();
			socket.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
