import java.util.Scanner;
public class Ch13Ex13
{
	public static void main(String args[])
	{
		Scanner over =  new Scanner(System.in);
		String app = over.nextLine();
		try
		{
			if(app.equals("520"))
			{
			throw new Error1();
			}else 
			{
				System.out.println(app);
			}
		}catch(Error1 e)
		{
			System.out.println("Error");
		}
		over.close();
	}
}
class Error1 extends Exception
{
	
}