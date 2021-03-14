import java.util.Scanner;
import java.io.*;
public class Ex3
{
	public static void main(String args[])throws InterruptedException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
	
		CTest hi = new CTest("hi");
	  CTest	ki = new CTest("ki");
	  CTest	ci = new CTest("ci");
	  CTest	di = new CTest("di"); 	
	  hi.start();
	  ci.start();
	  
	  try {	//ki.join(); 如果把還沒載入執行續的ki放在這裡 等於沒有效果
	//E// for(int i = 0;i<10;i++)//同一個 Thread.start();只能呼叫一次所以用for會衝突做到兩次以上
			hi.join();
			//ki.start();
			ci.join();
			//di.start();
			
				
	       }	
			catch(Exception e){
				System.out.println(e+ "QQQQQQQ");
				}
	  System.out.println("ERRRWD");
	  	/*因為使用了hi.join();敘述,它會使流程停在這˙個敘述並且等待
	  hi執行續做完才會繼續往下進入第18行,
	  similarly L18 &L19  所以main執行續(main也是執行續)中的 System.out.println()
	  會最後被印出來  */
/*hi 0  這是砍掉第19行的輸出
hi 1
hi 2
hi 3
hi 4
ERRRWD
ki 0
ki 1
ki 2
ki 3
ki 4*/
	}		
	
}
class CTest extends Thread
{	public  String id ;
	CTest(String name)
	{
		id = name ;
	}
	private int i=0;
	public void run()
	{	
		 for(int i =0;i<5;i++)
		{
			//for(int j = 0;j<10000;j++);
			System.out.println(id +" "+ i);	
		}
	}
}
/*
Thread threadB = new Thread(new Runnable() { 
public void run() { 
    try { 
        System.out.println("Thread B 開始.."); 
        for(int i = 0; i < 5; i++) { 
            Thread.sleep(1000); 
            System.out.println("Thread B 執行.."); 
        }
        System.out.println("Thread B 即將結束.."); 
    } 
    catch(InterruptedException e) { 
        e.printStackTrace(); 
    } 
} 
});*/