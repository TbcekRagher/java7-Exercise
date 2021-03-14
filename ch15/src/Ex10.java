import java.util.Scanner;
import java.io.*;
public class Ex10
{
	public static void main(String args[]) throws InterruptedException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		HH a1 = new HH("Hello");
		HH a2 = new HH("GoodBye");
		Thread Ta1 = new Thread(a1);
		Thread Ta2 = new Thread(a2);
		
		for(int i = 0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
				a1.run();
				Thread.sleep(2000);
				a2.run();
				
				
			}catch(InterruptedException e) {}
		}
	}
}
class HH implements Runnable
{	private String a ;
	private	int i =0;
	HH(String c){a=c ;}
	public void run()
	{	
	
		System.out.println(a+""+ (i++));
	}

}