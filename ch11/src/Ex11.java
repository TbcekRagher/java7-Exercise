public class Ex11
 {
	 public static void main (String args[])
	 {
		 	Cstu  std = new Cstu("940001","fibeer",90,92,95);
		 	std.showScore();
		 	std.show();
	 }
 }
interface Data
{
	public void show();
}
interface Test
{
	public void showScore();
}
class Cstu implements Data,Test
{  private float ave = 0f,a[]=new float[3];
	Cstu(String number,String name, float x, float b,  float c)
	{	
		a[0] = x;
		a[1] = b; 
		a[2] =c;
	  	ave = (float)(x+b+c)/3;
	}
	public void showScore()
	{
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}
	public void show()
	{
		System.out.println(ave);
	}
	
}

