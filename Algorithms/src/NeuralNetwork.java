
import java.util.function.*;
import java.util.*;public class NeuralNetwork
{
	
	private double[] [] inputWeights ;
	
	private double[] [] inputBias;
	
	private double[][] hiddenInput;
	
	private double[][] output;
	
	
	private double[][] inputWeightsLayer2;
	
	private double[][] inputBiasaLayer2;
	
	private double learningRate =0.03d;
	
	private Integer epoch = 100;
	
	
	//Function<double,double> sigmoid = (d ) -> {
		
		//return d;
	//};
	
	private static double tanh(double x)
	{
		double c = Math.exp(x) + (1/Math.exp(x));

		double s = Math.exp(x) - (1/Math.exp(x));

		return s/c;
	}
	
	private static double sigmoid(double x)
	{
		double inverdeE = 1/Math.exp(x);

		double result = 1/(1+inverdeE);

		return result;

	}
	
	
	private int randomInput(List<double[][]> inpu)
	{
		Random generator = new Random();
		
		int index = generator.nextInt(inpu.size());
		
		return index;
	}
	
	public void train(List<double[][]> inputs,List<Double> outputs)
	{
		for(int i=0;i<epoch;i++)
		{
			int index = randomInput(inputs);
			
			
			double[][] temp = MatrixUtil.multiply(inputWeights,
			inputs.get(index));
			temp = MatrixUtil.addition(temp,inputBias);
			// Since code is for single layer 
			
			double h = sigmoid(temp[0][0]);
			
			double actualY = outputs.get(index);
			
			double actualX = inputs.get(index)[0][0];
			
			
			double dw = actualX*(h-actualY);
			
			double db = (h-actualY);
			
			inputWeights[0][0] = inputWeights[0][0] - learningRate*dw;
			
			inputBias[0][0] = inputBias[0][0] - learningRate*db;
			
			
		}
	}
}
