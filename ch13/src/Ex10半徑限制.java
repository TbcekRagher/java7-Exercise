import java.util.Scanner;
public class Ex10半徑限制
{
	public static void main(String args[])
	{
		Scanner over  = new Scanner(System.in);
		Radius apk;
		double cxt = over.nextDouble();
		try
		{
			apk = new Radius(cxt);
		}
		catch( RadiusTooLarge k1)
		{
			System.out.println("Too large"+k1);
		}
		catch( RadiusTooSmall k2)
		{
			System.out.println("Too small"+k2);
		}
		Radius.show();
	}
}
class RadiusTooLarge extends Exception{}
class RadiusTooSmall extends Exception{}

class Radius
{	
	static private double radius;
    Radius( double ta) throws RadiusTooLarge ,RadiusTooSmall
	{	radius = ta;    //要把可能會拋出的例外類別都參考進去
    	
		   if(radius>100)
		   {	radius = 0;
			   throw new RadiusTooLarge();
		   }else if (radius<0)
		   {	radius = 0;
			    throw new RadiusTooSmall();
		   }
	}
    static void show ()
    {
    	System.out.println("area: "+radius*radius*3.14/2);
    }
    
	
}