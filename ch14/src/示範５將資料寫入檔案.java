import java.io.*;
public class 示範５將資料寫入檔案
{//透過程式碼將圖片轉換成binary 的型態來進行圖片複製
	public static void main(String args[])throws IOException
	{
		FileInputStream fi = new FileInputStream("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\精靈示範5的.jpg");
		//FileOutputStream fi = new FileOutputStream("c:\\java\xxx.txt",true);//從檔案後面加字
		FileOutputStream ki = new FileOutputStream("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\my_p.bmp");
	System.out.println("GIF Byte: "+fi.available());
	byte app[] = new byte[fi.available()];
	fi.read(app);
	ki.write(app);
	fi.close();
	ki.close();
	}
}