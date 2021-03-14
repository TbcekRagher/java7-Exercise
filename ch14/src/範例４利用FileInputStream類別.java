import java.io.*;
public class 範例４利用FileInputStream類別
{
	public static void main(String args[]) throws IOException//FileNotFoundException
	{
		FileInputStream fi = new FileInputStream("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\範例4的檔案.txt");
		int count= 0;
		System.out.println("File Byte:"+fi.available());
		byte ba[] = new byte[fi.available()];
		fi.read(ba);
		System.out.println(new String (ba));//new String (Byte ??)式String 類別的建構元
		fi.close();
	}
}