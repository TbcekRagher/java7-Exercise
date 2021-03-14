package self;
import java.util.Scanner;
public class main
{
	public static void main(  String [] args)
	{	//String 的Scanner參數要分開宣告
		Scanner otk = new Scanner(System.in);
		Scanner get = new Scanner(System.in);
	     int x = otk.nextInt();
	     //stu student = new stu(x);
	    // System.out.println(x);
	     String stdname[] = new String[x]; 
	  
	     int i =0;
	 for( i =0;i<stdname.length;i++)
	 { 	
		stdname[i] = get.nextLine();
		System.out.println(i);
	 }
	 for(i =0;i<stdname.length;i++)
	 {
		 System.out.println(stdname[i]);
	 }
	 otk.close();// 
	 get.close();
	}
}