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
			 System.out.println("�s�W�Ȥ���o");
			 InputStream  Inp = S.getInputStream();
			 int n = Inp.read(Buff);
			 System.out.println("�q���A������@�G");
			 System.out.println(new String(Buff,0,n));
			 Inp.close();
			 S.close();
		}catch (Exception e ) {}
	}
}