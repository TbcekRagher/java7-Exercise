import java.util.Scanner;
import java.io.*;
public class Ex13
{
	public static void main(String args[]) throws IOException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		CC c1 = new CC(2981);
		CC c2 = new CC(333);
		Thread Tc1 = new Thread(c1);
		Thread Tc2 = new Thread(c2);
		Tc1.start();
		Tc2.start();
	}
}
class CC implements Runnable
{	
	private int num =0;
	CC(int k )
	{
		num = k;
	}
	public void run()
	{	
		for(int i =0;i<12;i++)
		Bank.add(num);
	}
}
class Bank
{	private static int sum  =0;
	public static synchronized void add(int n )
	{//��Τ��P ����.������ϥΨ�P�@�� ���O��Ʈ� �b�C�O��Ƥ����[�Wsynchronized �i�H�����O���T�w�ܼƤ@�_�Q�Ѧ�
		int tp=sum;
		tp +=n;
		try
		{
			Thread.sleep((int)(1000*Math.random()));
		}catch(InterruptedException e) {}
		sum =tp ;
		System.out.println("sum: "+sum);
	}
	
}