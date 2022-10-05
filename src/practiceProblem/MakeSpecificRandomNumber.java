package practiceProblem;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class MakeSpecificRandomNumber {

	public static void main(String[] args) {
     // Make 5 Random Number
	
		Random rn = new Random();
		Set <Integer> ms= new LinkedHashSet<Integer>();
		//int [] num=new int[100];  had to commet it to make linked hashset
		
		for(int i=0;i<100;i++) {
			//num[i]=rn.nextInt(999 - 100 + 1) + 100;
		ms.add(rn.nextInt(999 - 100 + 1) + 100);
		
		}
		System.out.println(ms.size());
		//System.out.println(num[2]);     //we can have only one number from 100
		
//		Arrays.sort(num);
//	     for(int item:num) {
//	    	 System.out.println(item);
	     }
		
		
		
	}


