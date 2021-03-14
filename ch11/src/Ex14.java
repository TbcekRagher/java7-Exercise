public class Ex14
 {
	 public static void main (String args[])
	 {
		 OCk over = new OCk(8,6,2);
		 over.showData();
		 
	 }
 }
interface iVolume
{
	public void showData();
	public void vol();
}
abstract class CSphere implements iVolume
{
	final double PI = 3.14;
	protected int x,y ;
}

class OCk extends CSphere
{   
	private double r,volume ;
	OCk(int  w,int q,double z)
	{
		x = w;
		y= q;
		r = z;
		this.vol();
	}
	public void showData()
	{
		System.out.println("球心座標"+"("+x+','+")"+y);
		System.out.println("半徑 :"+r);
		System.out.println("求體積"+volume);
	}
	public void vol()
	{   
		volume = r*r*r*4/3*PI;
	}
}