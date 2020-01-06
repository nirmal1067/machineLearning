public class MatrixUtil
{
	
	public static void transposeMatrix(int[][] mat)
	{
		if(mat==null)
		{
			return;
		}

		for(int i=0;i<mat.length;i++)
		{
			for(int j=i+1;j<mat.length;j++)
			{
				int tmp = mat[i][j];

				mat[i][j]= mat[j][i];
				mat[j][i]=tmp; 
			}
		}


		for(int i = 0;i<mat.length;i++)
		{
			for(int c=0;c<mat.length;c++)
			{
				System.out.println(mat[i][c]);
			}
		}
		}
		
		
		public static double[][] multiply(double[] [] input,double[][] output)
		{
			return output;
		}
		
		
		public static double[][] addition(double[][] input,double[][] output)
		{
			return output;
		}
		
		
		public static double[][] substract(double[][] input,double[][] input2)
		{
			return input;
		}
}
