import java.util.*;
import java.io.*;
public class 示範3HashMap
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
		System.out.println("如果包含 cdple救回傳true!~!~~"+f.containsValue("cdple"));
		f.get("apple");
		System.out.println("是空的嗎??"+f.isEmpty());
		
		//HashSet<Integer> g = f.keySet();// 將所有的關鍵直轉成 Set介面來用
		Set<Integer> g =f.keySet();
		System.out.println("將所有的關鍵直轉成 Set介面來用: "+g);
		System.out.println("刪除對號value值 並回傳刪掉的東西:  "+f.remove(94001)); //刪除關鍵字key的元素
		System.out.println("數量:  "+f.size());
	}
}