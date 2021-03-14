import java.util.*;
import java.io.*;
public class 範例set介面andHashSet
{
	public static void main(String args[]) 
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		Cttt<String> f = new Cttt<String>("dog");
		f.show();
		//////////////////////////////////
	HashSet <String> hset = new HashSet<String>();
	HashSet <String> f1 = new HashSet<String>();
	//HashSet f2 = new HashSet(hset);
	hset.add("mom");
	hset.add("Dad");
	hset.add("mom");
	hset.remove("mom");
	hset.clear();
	System.out.println(hset.containsAll(hset));
	
	System.out.println("HashSet 內容:"+hset+""+hset.isEmpty());
	//System.out.println("HashSet 內容:"+f2);
	}
}
class Cttt<T>
{	private T id;
	Cttt(T ac)
	{
	id = ac;
	}
	void show()
	{
		System.out.println("id :"+id);
	}
}