public class Ex5
 {
	 public static void main (String args[])
	 {
		 
	 }
 }
interface Math
{
	public void show();
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}
abstract class Color
{ 	protected String color ;
	Color (String k)
	{
		color = k;	
	}
}

class Oppe extends Color implements Math
{	private int total;
 	Oppe(String string)
 	{
 		super(string);
 	}
	public void show()
	{
		System.out.println(total);
	}
	public void add(int a, int b)
	{
		total = a+b;
	}
	public void sub(int a, int b)
	{
		total = a-b;
	}
	public void  mul(int a, int b)
	{
		total = a*b;
	}
	public void div (int a, int b)
	{
		total = (int )a/b;
	}
}
/*class Oppe  implements Math
{	private int total;
	public void show()
	{
		System.out.println(total);
	}
	public void add(int a, int b)
	{
		total = a+b;
	}
	public void sub(int a, int b)
	{
		total = a-b;
	}
	public void  mul(int a, int b)
	{
		total = a*b;
	}
	public void div (int a, int b)
	{
		total = (int )a/b;
	}
}*/