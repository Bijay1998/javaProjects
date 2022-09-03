import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
/**
 * 
 */

/**
 * @author bijay
 *
 */
public class InteropClientPython {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("localhost", 10001);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("Welcome to PCPS!!!");
			
			dos.flush();
			dos.close();
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			dis.readUTF();
			dis.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}