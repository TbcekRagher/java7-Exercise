import java.util.Scanner;
public class Ex8�W�ߪ�class���~���ߥX
{
	public static void main(String args[])
	{
		Scanner over = new Scanner(System.in);
		Chest app = new Chest();
		try
		{
			app.alpha(10,0);
		}catch(Exception e)
		{
			System.out.println("�X���o!!");
		}
	}
	
}
class Chest
{
	 void alpha(int a,int b) throws ArithmeticException
	{
	 System.out.println("a/b = "+a/b);	
	}
}