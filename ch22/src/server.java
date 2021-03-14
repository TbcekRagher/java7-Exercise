import java.net.*;
import java.io.*;

public class server 
{		
	public static void main(String args[])
	{  byte Buff[] =new byte[1024];
	try
		{
			 ServerSocket SS = new ServerSocket(12332);
			 Socket S= SS.accept();
			 System.out.println("連上客戶端囉");
			 InputStream  Inp = S.getInputStream();
			 int n = Inp.read(Buff);
			 System.out.println("從伺服器收到　：");
			 System.out.println(new String(Buff,0,n));
			 Inp.close();
			 S.close();
		}catch (Exception e ) {}
	}
}