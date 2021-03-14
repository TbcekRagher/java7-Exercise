import java.util.Scanner;
public class Ex8獨立的class做外部拋出
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
			System.out.println("出錯囉!!");
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