public class ex16
{
	
	public static void main(String[] args)
	{
		Csphere fre = new Csphere();
		double SphereArea = fre.surfaceArea();
	System.out.println(SphereArea);
	}
}
class Csphere
{
	private double x,y,z,radius,PI = 3.14d;
	private void Setlocation()
	{
		x= 3.0;
		y= 4.0;
		z= 5.0;
	}
	 private void setradius(int r )
	 { 
		radius = r; 
	 }
	 public double surfaceArea()
	 { 
		 double surface =0;
		this.setradius(1);//沒這行就會變成0
	  	surface = 4*PI*radius*radius;
		 return surface;
	 }
}