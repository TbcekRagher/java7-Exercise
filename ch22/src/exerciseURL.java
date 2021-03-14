import java.net.*;
import java.io.*;
public class exerciseURL
{	
	public static void main(String args[])
	{	try
	{
		URL U = new URL("https://www.youtube.com/");
		System.out.println(U.getPort());
		System.out.println(U.getContent());//IOexception problem
		System.out.println(U.getFile());
		System.out.println(U.getHost());
		System.out.println(U.getPath());
		System.out.println(U.getProtocol());
		
	}catch (MalformedURLException e)
	{
		System.out.println("ERROE " +e);
	
	}
	catch(IOException e)
	{
		System.out.println("ERROE " +e);
	}
	}
	
}