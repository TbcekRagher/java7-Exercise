import java.util.*;
import java.io.*;
public class �ܽdTreeSet
{
	public static void main(String args[]) 
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
	TreeSet <Integer> f = new TreeSet<Integer>();
	for(int i =0;i<1000;i++)
	{
		f.add((int)(Math.random()*10000+1));
	}
	f.<Integer>first();
	System.out.println("f.<Integer>first():  "+f.<Integer>first());
	System.out.println("f.last(): "+f.<Integer>last());
	System.out.println("f.subSet(19, 31)"+f.<Integer>subSet(19, 31));
	System.out.println("�j��8��"+f.<Integer>tailSet(31));//�j�󵥩�31�����X
	System.out.println("�p��100��"+f.<Integer>headSet(100));//�p��
	}
}	