public class Ex2rewrite
{
	public static void main(String atgs[])
	{
		int app = 12; 
		int den[] = {14,0,4,5,0,0,3};
		for(int i =0;i<10;i++)
		{	
			try
			{
				System.out.print(i+1+".");
				System.out.println(app/den[i]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("除數有問題"+e);
			}
			catch(ArrayIndexOutOfBoundsException w )
			{
				System.out.println("陣列超過 :"+w );
			}
		
		}
	}
}