import java.io.*;

public class 範例３從當緩衝區讀取資料使用BufferReader類別
{
	public static void main(String args[])throws IOException
	{
		String over ;
		int count =0;
		FileReader HIBB = new FileReader("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\示範3的檔案.txt");
		BufferedReader fr = new BufferedReader(HIBB);
		//BufferedReader fr = new BufferedReader(HIBB,int size); int size的部分式設立緩衝區（BUFFER)的大小
		//*在bufferedReader中的函式　readLine()跟Ｃ的fgets()類似都是一次讀取一行
		//readLine()會在讀完所有檔案的資料後回傳ｎｕｌｌ
		while((over = fr.readLine())!=null) //java 的ｎｕｌｌ是全小寫
		{
			//System.out.println(fr.readLine());//這樣寫會在一個while裡面讀取兩行
			System.out.println(over);
			count++; 
		}
		System.out.println(count+" line");
		fr.close();
	}
}