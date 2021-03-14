public class ex7
{
	
	public static void main(String[] args)
	{
		Test prop = new Test();
	  int b = 20;
		prop.getnumber(0);
	}
}
class Test
{ 	private int judgenumber;
	public void  getnumber(int a)
	{ 	if(a>0)
		{
			judgenumber = a ;
			System.out.println(judgenumber + "  is a postive number");
			
		}else System.out.println(judgenumber +" is a negative number");
	}
}