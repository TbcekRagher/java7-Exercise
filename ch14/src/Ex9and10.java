import java.util.Scanner;
import java.io.*;
public class Ex9and10
{
	public static void main(String args[]) throws IOException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		FileReader over = new FileReader("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\3q.txt");
		BufferedReader buover = new BufferedReader(over);
		String str;  double X[] = new double[20];int count =0;
		while((str = buover.readLine())!=null)
		{
			X[count++] = Double.parseDouble(str);
		}
		double ave=0,max=X[0],min=X[0];
		for(int i = 0;i<count;i++)
		{	if(X[i]>max)max = X[i];
			if(X[i]<min)min = X[i];
			ave += X[i];
		}
		ave = ave/(double)count ;
		System.out.println("ave: "+ave+" max "+max +" min "+min);
	double tmp;int i =0;
		for( i=0;i<count-1;i++)
		{
			for(int j=0;j<count-i-1;j++)
			{
				if(X[j]>X[j+1])
				{
					 
					tmp = X[j+1] ;
					X[j+1] = X[j];
					X[j]= tmp;
				}
			}
		}
		for( i = 0;i<count;i++)
		{	
			System.out.println(X[i]);
		}
		over.close();
	}
	
}
 


/*class bubblesort
{
	static void sort(double X[],int count)
	{
		int i ,j;
		for(i=0;i<count;i++)
		{
			for(j=0;j<count;j++)
			{
				if(X[j]>X[j+1])swap(X[j],X[j+1]);
			}
		}
	}
	 static void swap (double a,double b)
	{
		double tmp =0;
		tmp = b ;
		b = a;
		a= tmp;
	}
}*/