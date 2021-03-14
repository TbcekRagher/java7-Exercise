public class Ex2
 {
	 public static void main (String args[])
	 {
		Cphere over[] = new Cphere[10];
		
		for(int i =0;i<10;i++)
		{
			over[i] = new CCircle("abced ");
		}
	 } 
}

abstract class  Cphere
{
	 protected String color;
	 public void setcolor(String str)
	 {
		 color = str;
	 }
	 public abstract void show();
	 Cphere(String k)
	 {
		 color = k;
	 }
}

class CCircle extends Cphere
{		
	public  CCircle(String a)
	 {
		 super(a);
	 }
	public void show()
	 {
		 System.out.println("color"+color);
	 }
}