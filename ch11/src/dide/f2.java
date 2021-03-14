package dide;
public class f2
{
	public static void main(String args[])
	{
		char a[]=  {'a','m','y'};
		String b = new String(a);
		 System.out.println(b);
		 String apple = "Apple is very yunny.";
		 int beginIndex = 0;
		 System.out.println('1'+apple.charAt(3));
		 System.out.println('2'+" "+apple.equals("Apple is very yunny."));
		 System.out.println('3'+" "+apple.indexOf('v'));
		 //System.out.println(apple.indexOf(a));這樣會錯喔!不是字元
		 System.out.println('4'+apple.substring(beginIndex+3));
		 System.out.println('5'+apple.substring(3));
		 System.out.println('6'+apple.substring(4,9));
		 System.out.println('7'+" "+ apple.startsWith("Ap"));
		 System.out.println('8'+apple.toLowerCase());
	}
}