public class ex2
{
	
	public static void main(String[] args)
	{
			cbbb consider = new cbbb();
			consider.name = "Sandy";
			consider.height = 1.65d;
			consider.weight = 58.2d;
			double BMI = consider.weight/(consider.height*consider.height);
			System.out.println(BMI);
	}
}	
	class cbbb
	{
		String name;
		double height;
		double weight;
	}