import java.util.Scanner;
public class Ex12�P�_�T����
{
	public static void main(String args[])
	{  Scanner over = new Scanner(System.in);
		int a= over.nextInt();
		int b= over.nextInt();
		int c= over.nextInt();
		try//�ĥ�try;
		{
		if(a==b&b==c)
		{
			System.out.println("�O���T����");
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
class NotTriangle extends Exception{} //�~�ӪŪ�Exception ���O