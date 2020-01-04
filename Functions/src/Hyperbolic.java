public class Hyperbolic
{
	public static void main(String[] args)
	{
		System.out.println(tanh(.89d));
		System.out.println(sinh(.89d));
		System.out.println(cosh(.89d));
	}
	
	
	private static double tanh(double x)
	{
		double c = Math.exp(x) + (1/Math.exp(x));
		
		double s = Math.exp(x) - (1/Math.exp(x));
		
		return s/c;
	}
	
	
	private static double sinh(double x)
	{
		return Math.exp(x) - (1/Math.exp(x));
	}
	
	
	private static double cosh(double x)
	{
		return Math.exp(x)+(1/Math.exp(x));
	}
}
