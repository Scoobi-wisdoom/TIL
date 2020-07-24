package ex;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex2 {
	
	public static void main(String args[]) {
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.111.2", 8888);
			// When it is connected, data are to be transferred.
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Disconnect
//			socket.close();
		}         
	}
	
}
