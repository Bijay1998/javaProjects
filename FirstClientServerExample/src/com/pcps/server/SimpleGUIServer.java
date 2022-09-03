/**
 * 
 */
package com.pcps.server;
import javax.swing.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @author Dell
 *
 */
public class SimpleGUIServer extends JFrame implements ActionListener{

	JFrame serverframe;
	JTextArea msgarea;
	JLabel lbltitle;
	JButton btnstart;
	
	public SimpleGUIServer()
	{
		serverframe = new JFrame("Message Server");
		msgarea = new JTextArea();
		msgarea.setBounds(20,100,250,250);
		lbltitle = new JLabel("Welcome to Message Server");
		lbltitle.setBounds(20,30,500, 50);
		btnstart = new JButton("Start Server");
		btnstart.setBounds(20,400,150,30);
		btnstart.addActionListener(this);
		
		serverframe.add(lbltitle);
		serverframe.add(msgarea);
		serverframe.add(btnstart);
		
		msgarea.setText("Server Started and listening at port 5081");
		
		serverframe.setLayout(null);
		serverframe.setSize(600,600);
		serverframe.setVisible(true);
		serverframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleGUIServer();
	}
	
	public void startServer()
	{
		try
		{
			ServerSocket serversocket = new ServerSocket(5081);
			Socket socket = serversocket.accept();
						
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String msg = dis.readUTF();
			System.out.println("Message: " + msg);
			msgarea.setText(msgarea.getText() + "\n" + msg);
			
			socket.close();
			serversocket.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			msgarea.setText(msgarea.getText() + "\n" + e.getMessage());
			
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnstart)
		{
			this.startServer();
		}
	}

}
