import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Client
{		
	public static void main(String args[])
	{  byte Buff[] =new byte[1024];
	try {
			Socket S = new Socket("192.168.100.8",12332);
			System.out.println("���W���A���o�I�I");
			OutputStream out = S.getOutputStream();

	}catch(Exception e) {}
	}
}