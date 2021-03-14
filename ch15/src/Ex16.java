public class Ex16
{//沒看出哪個執行續先跑完
	public static void main(String args[])
	{
		int a1 = 0;
		int a2 = 0;
		isprime over1 = new isprime(2,100000);
		isprime over2 = new isprime(100000,200000);
		over1.start();
		try {over1.join();}catch(Exception e) {}
		
		over2.start();
		System.out.println("?///////////////");
	}
}
class isprime extends Thread
{	private int  k ;
	private int  B ;
	private int count = 0;
	isprime(int cc,int Max)
	{
		k = cc;
		B = Max;
	}
	public  void  run()
	{	boolean SS;
			int tmp = k;
		for(int i=0;i<B;i++)
		{	
			SS = Jprime(tmp);
			if(SS==true)
			{//System.out.println(k+"  "+count);
				count++;
			}
			tmp++;
		}
		this.show();
		count = 0;
	}
	public boolean Jprime(int tmp)
	{	int n = 2;
		boolean MIR = true;
		while(n<Math.sqrt(tmp))
		{	
			if(tmp%n!=0)
			{
				n++;
			}else 
			{
				MIR = false;
				break;
		}
	}
		return MIR;
	}
	public void show()
	{	
		System.out.println(count);
		System.out.println("has down"+"("+k+","+B+")");
	}
}