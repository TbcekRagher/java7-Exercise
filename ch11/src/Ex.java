
public class Ex
 {
	 abstract class  Cphere
	 {
		 protected String color;
		 public void setcolor(String str)
		 {
			
			 color = str;
		 }
		 public abstract void show();
		 Cphere(String k)
		 {
			 color = k;
		 }
	 }
	 public static void main (String args[])
	 {
		 //Cphere over = new Cphere("OK");//wrong
	 }
 }
 /*class compute extends Math
 {
	 void add(int a,int b)
	 {
		 ans = a+b;
	 }
 }*/