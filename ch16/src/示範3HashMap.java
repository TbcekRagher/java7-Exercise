import java.util.*;
import java.io.*;
public class �ܽd3HashMap
{
	public static void main(String args[]) throws IOException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		HashSet<String> h = new HashSet<String>();
		HashMap<Integer,String> f = new HashMap<Integer,String>();
		f.put(94001,"apple");
		f.put(94201,"baple");
		f.put(94301,"cdple");
		System.out.println(f.containsKey(94001));
		System.out.println("�p�G�]�t cdple�Ϧ^��true!~!~~"+f.containsValue("cdple"));
		f.get("apple");
		System.out.println("�O�Ū���??"+f.isEmpty());
		
		//HashSet<Integer> g = f.keySet();// �N�Ҧ������䪽�ন Set�����ӥ�
		Set<Integer> g =f.keySet();
		System.out.println("�N�Ҧ������䪽�ন Set�����ӥ�: "+g);
		System.out.println("�R���︹value�� �æ^�ǧR�����F��:  "+f.remove(94001)); //�R������rkey������
		System.out.println("�ƶq:  "+f.size());
	}
}