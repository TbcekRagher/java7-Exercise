package dide;
public class wrqapperclass
{
	public static void main(String args[])
	{	//Ex:
		String str; 
			int num = Integer.parseInt("345");
		System.out.println(num);
			str = Integer.toString(num)+"123123";
		System.out.println(str);
////////////////////////////////////////////////////////
		/*Byte a1 = 10;
		String s = "345";
		System.out.println(parseByte(" "));做不出來*/
////////////////////////////////////////////////////////
		/*自動裝箱運用的方法還可以如下：
int i = 10; 
Integer integer = i;
您也可以使用更一般化的 java.lang.Number 類別來自動裝箱，
例如： Number number = 3.14f;
::宣告類別物件 直接裝箱3.14f 會先被自動裝箱為 Float，然後指定給 number。*/ 
////////////////////////////////////////////////////////	
		//character ckt = new character('a');
		Character ww=new Character('a');
		String con = ww.toString('8');
		System.out.println(con);
		 System.out.println(Math.sin(Math.PI/2));
		System.out.println(Math.random());
		Integer ab = 10;
		String test = "345";
	//	String k = Integer.parseInt(test);
	}
}
