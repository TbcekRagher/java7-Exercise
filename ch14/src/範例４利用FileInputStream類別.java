import java.io.*;
public class �d�Ң��Q��FileInputStream���O
{
	public static void main(String args[]) throws IOException//FileNotFoundException
	{
		FileInputStream fi = new FileInputStream("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\�d��4���ɮ�.txt");
		int count= 0;
		System.out.println("File Byte:"+fi.available());
		byte ba[] = new byte[fi.available()];
		fi.read(ba);
		System.out.println(new String (ba));//new String (Byte ??)��String ���O���غc��
		fi.close();
	}
}