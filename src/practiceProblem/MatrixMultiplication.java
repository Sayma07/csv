package practiceProblem;

public class MatrixMultiplication {

	public static void main(String[] args) {

	//Matrix Multiplication	
		
		                                       //nested loop=loop inside a loop.
		int N=3;
		 
		for(int i=1;i<=N;i++) {                //here i is for horizontal  line
			//System.out.print(i+"\t");
			for (int j=1;j<=N;j++) {             //here  j is for vertical line
				System.out.print(i*j+"\t");
			}
			System.out.println();            //break
			
			
			
			
		}
		
	}

}
