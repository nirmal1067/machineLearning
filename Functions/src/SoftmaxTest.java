import java.util.*;public class SoftmaxTest
{

	public static void main(String[] args)
	{
		double[] inputs ={5d,2d,-1d,3d};

		softmax(inputs);



		System.out.println(Arrays.toString(inputs));
	}


	private static double[] softmax(double[] inputs)
	{
		if(inputs==null)
		{
			return null;
		}

		double sum = 0.0d;

		double finalSum = 0.0d;

		for(int i =0; i<inputs.length;i++)
		{
			sum = sum + Math.exp(inputs[i]);
		}

		for(int j=0;j<inputs.length;j++)
		{
			inputs[j] = Math.exp(inputs[j])/sum;
			finalSum = inputs[j]+finalSum;
		}

		System.out.println(finalSum);
		System.out.println(sum);
		return inputs;
	}
}
