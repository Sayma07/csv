package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import utility.DateFunction;

public class WriteTextFiles {

	public static void main(String[] args) throws IOException {

	
		
		DateFunction df=new DateFunction();	
		String curTime=df.getCurrentDateTime();
		
		
		
		String path="C:\\Users\\nazmu\\eclipse-workspace_April_2022\\Class10\\data\\xyz_"+curTime+".txt";
		
		File f= new File(path);                             //pointing the path of xyz;
	    FileWriter fw=new FileWriter(f,true);            //(f.true means it will add the writing not override)
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		
		bw.write("Hi I am Farhana.");
		bw.newLine();
		bw.write("Last Day of Java");
		bw.newLine();
		bw.write("Bye bye");
		
		bw.close();
		
	}

}
