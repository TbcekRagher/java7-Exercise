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
		System.out.println("�y�߮y��"+"("+x+','+")"+y);
		System.out.println("�b�| :"+r);
		System.out.println("�D��n"+volume);
	}
	public void vol()
	{   
		volume = r*r*r*4/3*PI;
	}
}