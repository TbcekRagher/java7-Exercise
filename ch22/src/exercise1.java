import java.net.*;
import java.io.*;
public class exercise1
{	
	public static void main(String args[])
	{
		//InetAddress a[] = InetAddress.getAllByName("");
		//InetAddress x = InetAddress.getByName("");
		//InetAddress y = InetAddress.getLocalHost();
		try 
		{
			//InetAddress addr = InetAddress.getLocalHost();
			//System.out.println(addr.getHostAddress());
			//System.out.println(addr.getHostName());
			//System.out.println(addr);
			InetAddress zxc = InetAddress.getByName("LAPTOP-NUIFVC2N");
			System.out.println(zxc.getHostAddress());
		}catch(UnknownHostException e)
		{
			System.out.println("�L�k���oIP ��m");
		}
	}

	
}