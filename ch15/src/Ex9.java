import java.util.Scanner;
import java.io.*;
public class Ex9
{
	public static void main(String args[])
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		HIW t1 = new HIW("t1");
		HIW t2 = new HIW("t2");
		//Thread Tt1 = new Thread (t1);
		//Thread Tt2 = new Thread (t2);
	for(int i =0;i<10;i++)
	{	try {
		t1.run();
		Thread.sleep(1000);
		t2.run();
		Thread.sleep(2000);
		System.out.println(i);
		Thread.sleep(5000);
	}catch(InterruptedException e) {return;}
		
	}
			
	}
}
class HIW implements Runnable
{	private String time ;
	HIW(String k)
	{time = k;}
	public  void run()
	{
		System.out.println("Thread "+time+" is running");
	}
	
}