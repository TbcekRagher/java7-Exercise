import java.util.Scanner;
public class Ex12判斷三角形
{
	public static void main(String args[])
	{  Scanner over = new Scanner(System.in);
		int a= over.nextInt();
		int b= over.nextInt();
		int c= over.nextInt();
		try//藥用try;
		{
		if(a==b&b==c)
		{
			System.out.println("是正三角形");
		}else if((a+b)<c||(a+c)<b||(b+c)<a)
		{ 
		 throw new	NotTriangle();
		}
		}
		catch(NotTriangle k)
		{
			System.out.println("error: "+ k);
		}
	over.close();
	}
}
class NotTriangle extends Exception{} //繼承空的Exception 類別