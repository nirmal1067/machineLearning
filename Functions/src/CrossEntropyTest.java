
import org.apache.http.impl.execchain.*;public class CrossEntropyTest
{
	//http://rpubs.com/juanhklopper/cross_entropy

	private static Double crossEntropy(int[] table,double[] prob)
	{
		Double result = 0.0d;

		for(int i = 0;i<table.length;i++)
		{
			result = result + table[i] * Math.log(prob[i]);
		}

		return -result;
	}


	public static void main(String[] args)
	{
		int[] table ={0,0,1};

		double[] probs ={0.1,0.8,0.1};

		System.out.println(crossEntropy(table,probs));
	}

	private double entropy(double[] prob)
	{
		double result = 0.0d;

		for(int i =0;i<prob.length;i++)
		{
			result = result = prob[i] * Math.log1p(prob[i]);
		}

		return result;
	}
}
