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
	  
	  try {	//ki.join(); �p�G���٨S���J������ki��b�o�� ����S���ĪG
	//E// for(int i = 0;i<10;i++)//�P�@�� Thread.start();�u��I�s�@���ҥH��for�|�Ĭ𰵨�⦸�H�W
			hi.join();
			//ki.start();
			ci.join();
			//di.start();
			
				
	       }	
			catch(Exception e){
				System.out.println(e+ "QQQQQQQ");
				}
	  System.out.println("ERRRWD");
	  	/*�]���ϥΤFhi.join();�ԭz,���|�Ϭy�{���b�o���ӱԭz�åB����
	  hi�����򰵧��~�|�~�򩹤U�i�J��18��,
	  similarly L18 &L19  �ҥHmain������(main�]�O������)���� System.out.println()
	  �|�̫�Q�L�X��  */
/*hi 0  �o�O�屼��19�檺��X
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
        System.out.println("Thread B �}�l.."); 
        for(int i = 0; i < 5; i++) { 
            Thread.sleep(1000); 
            System.out.println("Thread B ����.."); 
        }
        System.out.println("Thread B �Y�N����.."); 
    } 
    catch(InterruptedException e) { 
        e.printStackTrace(); 
    } 
} 
});*/