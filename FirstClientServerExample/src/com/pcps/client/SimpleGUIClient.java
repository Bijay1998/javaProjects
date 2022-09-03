/**
 * 
 */
package com.pcps.client;
import javax.swing.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @author Dell
 *
 */
public class SimpleGUIClient extends JFrame implements ActionListener{
	
	JFrame clientframe;
	JLabel ltitle, lmsg;
	JTextArea msgarea;
	JTextField msg;
	JButton sendmsg;
	Socket socket;
	
	public SimpleGUIClient()
	{
		clientframe = new JFrame("Client Program");
		ltitle = new JLabel("Welcome to the Client Program!!!");
		ltitle.setBounds(20,20, 300, 50);
		msgarea = new JTextArea();
		msgarea.setBounds(20,100, 250, 250);
		lmsg = new JLabel("Message: ");
		lmsg.setBounds(20,300, 100, 30);
		msg = new JTextField();
		msg.setBounds(20,400, 200, 30);
		sendmsg = new JButton("Send");
		sendmsg.setBounds(20, 500, 100, 30);
		
		sendmsg.addActionListener(this);
		
		clientframe.add(ltitle);
		clientframe.add(msgarea);
		clientframe.add(lmsg);
		clientframe.add(msg);
		clientframe.add(sendmsg);
		
		clientframe.setLayout(null);
		clientframe.setSize(600,600);
		clientframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clientframe.setVisible(true);
		
		connecttoServer();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleGUIClient();
	}
	
	public void connecttoServer()
	{
		try
		{
			socket = new Socket("localhost", 5081);
			msgarea.setText("Client connected to server on port 5081");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			try {
				socket.close();
			}
			catch(Exception ei)
			{
				ei.printStackTrace();
			}
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==sendmsg)
		{
			String txt = msg.getText();
			try
			{
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				dos.writeUTF(txt);
				dos.flush();
				dos.close();
				socket.close();
			}
			catch(Exception ei)
			{
				ei.printStackTrace();
			}
			
		}
	}

}
