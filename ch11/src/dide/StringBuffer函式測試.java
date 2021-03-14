package dide;
public class StringBuffer¨ç¦¡´ú¸Õ
{
	public static void main(String args[])
	{
		StringBuffer NONO = new StringBuffer("Andrea is really a beauty girl");
		 final StringBuffer NONO1 = NONO;
		//System.out.println("1 "+NONO.append('w'));
		System.out.println("2 "+NONO.append(",I do love her"));
		System.out.println("3 "+NONO.deleteCharAt(7));
		System.out.println("4 "+NONO.insert(18,"kind and "));
		System.out.println("5 "+NONO.insert(3,'g'));
		System.out.println("6 "+NONO.replace(7,9,"was"));
		System.out.println("7 "+NONO.reverse());
		System.out.println("8 "+NONO1.toString());
	}
	
}