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
	{	// synchronize �N��O�o�ӫ��� synchronize����� �@�w�n���㰵���@���~�|�A�Q�t�@�ӨϥΤ���i��h����
		try 
		{
			Thread.sleep((int)(Math.random()));
		}
		catch(InterruptedException e) {}
		sum = sum-((int)(Math.random()*100)+1);
		System.out.println("sum: "+sum);
	}
}