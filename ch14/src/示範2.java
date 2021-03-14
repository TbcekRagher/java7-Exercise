import java.io.*;

public class 示範2
{
		public static void main (String args[]) throws IOException
		{///////////////////////////////////////////////////////////////////////////
			FileWriter fr = new FileWriter("C:\\Users\\YQQ\\eclipse\\java-2019-06\\eclipse\\ab.txt",true);
			char K[] = {'A','n','d','r','e','a','i','s','b','e','a','u','t','y'};
			String abq = "ANDREA IS VERY　PRETTY.";
			fr.flush();
			//fr.write(K);
			fr.write(K,2,10);
			//fr.write(abq);
			System.out.println("123");
			fr.close();
		}
}
class S_Write extends Writer
{
	public void flush()
	{ 	
		System.out.println("empty");//沒有任何作用
	}
	public void close()
	{
		
	}
	public void write(char a[],int x ,int b) 
	{
		
	}
}
