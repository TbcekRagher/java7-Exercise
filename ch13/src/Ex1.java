public class Ex1
{
	public static void main(String args[])
	{
		int app = 15,q = 1;
		try
		{
			//int k = app/q; 
			System.out.println(app/q);
		}
		catch(ArithmeticException e)
		{
			System.out.println("���ƬO0");
		}
		finally
		{
			
		}
	}
}