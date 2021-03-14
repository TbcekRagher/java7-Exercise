public class Ex15
 {
	 public static void main (String args[])
	 {
		 boolean S ;
		CShape over = new CCCircle();
		 S = (over instanceof CShape);
				 System.out.println("Cirlce instanceof CSphape:¡@"+S);		 
	 }
 }
class CShape{}
class CCCircle extends CShape{}
class Ctriangle extends CShape{}
class CCoin{}
