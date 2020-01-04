public class Sigmoid
{
	public static void main(String[] args)
	{
		System.out.println(sigmoid(.000078d));
	}
	
	private static double sigmoid(double x)
	{
		double inverdeE = 1/Math.exp(x);
		
		double result = 1/(1+inverdeE);
		
		return result;
		
	}
}
