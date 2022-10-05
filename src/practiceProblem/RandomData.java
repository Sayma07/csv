package practiceProblem;

import java.util.Random;

public class RandomData {

	public static void main(String[] args) {

	//make one Random number between 100 to 999	
		//387
		
		Random rn = new Random();
		int answer = rn.nextInt(999 - 100 + 1) + 100;
		
		System.out.println(answer);
	
	
	
	}

}
