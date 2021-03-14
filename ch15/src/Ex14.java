import java.util.Scanner;
import java.io.*;
public class Ex14
{
	public static void main(String args[])
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		RreRaid XX= new RreRaid();
		XX.start();
		
	}
}
class RreRaid extends Thread
{
	private static int sum = 200;
	
	public void run()
	{	int fee ;
		for(int i=0;i<3;i++)
		{	if(sum>10)
			{ 
				fee = (int)(Math.random()*100);	
				talk(fee);
			}	
		}
	}
	private static synchronized  void  talk(int fee)
	{	// synchronize 意思是這個持有 synchronize的函數 一定要完整做完一次才會再被另一個使用不能進行多執行
		try 
		{
			Thread.sleep((int)(Math.random()));
		}
		catch(InterruptedException e) {}
		sum = sum-((int)(Math.random()*100)+1);
		System.out.println("sum: "+sum);
	}
}