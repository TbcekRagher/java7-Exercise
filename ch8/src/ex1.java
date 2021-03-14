public class ex1
{
	
	public static void main(String[] args)
	{
		caaa over =  new caaa();
		over.a =  5;
		over.b = 7;
		//System.out.println(over.a+" "+over.b);
		over.c = over.a *over.b;
		System.out.println(over.c);
		
	}
}
class caaa //class 不能宣告在裡面
{
	int a;
	int b;
	int c;
}