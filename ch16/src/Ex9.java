import java.util.*;
import java.io.*;
public class Ex9
{
	public static void main(String args[])  
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println();
		
		HashMap<Integer,Integer> hamp = new HashMap<Integer,Integer>(5);
		for(int i = 0;i<5;i++)
		{
			hamp.put(i,(int)(Math.random()*100+1));
		}
		System.out.println("5�Ӥp��100�����: "+hamp);
		Collection<Integer> tr = hamp.values();
		System.out.println("5�Ӥp��100�����under Collection tr: "+tr);
		
		Set<Integer> S =hamp.keySet();//�N������নset�Ҧ�  ��K��Set����@�����G��
		System.out.println("5�Ӥp��100�����under Set s: "+S);
		HashSet<Integer> f = new HashSet<Integer>(S);
		System.out.println("5�Ӥp��100�����under HashSet f: "+f);
	}
}