import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class SocketServer {
	public static void main(String[]args){
		try {
			int udpSocket = 6024;
			DatagramSocket serverSocket = new DatagramSocket(udpSocket);
			byte [] recieveData = new byte[1024];
			byte [] sendData = new byte[1024];
			DatagramPacket serverPack = new DatagramPacket(recieveData,1024);
			InetAddress net = InetAddress.getByName("192.168.0.18");
			while (true){
				
				serverSocket.receive(serverPack);
				serverPack.getData();
				String a = new String(recieveData);
				System.out.println(a);
				//serverSocket.send(serverPack);
			}
		}

		catch (Exception ex){
			System.err.println("error");
		}
	}
}
