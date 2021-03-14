public class Ex8
 {
	 public static void main (String args[])
	 {
		 Cccc over = new Cccc();
		 over.set(5);
		 over.show();
	 }
 }

interface iAaa
{
	public abstract void show(); 
}
class Cbbb
{
	public int mum = 10;
	public void set (int n)
	{
		mum = n;
	}
}
class Cccc extends Cbbb implements iAaa
{	
	public void show()
	{
		System.out.println(mum);
	}
}