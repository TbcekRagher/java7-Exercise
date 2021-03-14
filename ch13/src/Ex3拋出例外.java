import java.util.Scanner;
public class Ex3©ß¥X¨Ò¥~
{
	public static void main(String args[])
	{
		Scanner over = new Scanner(System.in);
		int k = over.nextInt();
		int q = over.nextInt();
		try
		{
		if(q==0)
		{
			throw new ArithmeticException();
		}else
		{
			System.out.println((float)k/q);
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("problem: "+e);
		}
		over.close();
	}
}