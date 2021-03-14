import java.util.Scanner;
import java.io.*;
public class Ex2
{
	public static void main(String args[])
	{
		Scanner over = new Scanner(System.in);
		int n =over.nextInt();
		
		System.out.println(kk(n));
		
	}
	static int  kk(int n)
	{	if(n==0)return 0;
		return n+kk(n-1);
	}
	
}