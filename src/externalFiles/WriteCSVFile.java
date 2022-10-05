package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {

	public static void main(String[] args) throws IOException {

String path="C:\\Users\\nazmu\\eclipse-workspace_April_2022\\Class10\\data\\xyz.csv";
		
		File f= new File(path);                             //pointing the path of xyz;
	    FileWriter fw=new FileWriter(f);            
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		
		bw.write("School,Class,Grade");
		bw.newLine();                 //It will open in a excel file
		bw.write("TF, Java, 95");
		bw.newLine();
		bw.write("TF,CNS,85");
		bw.newLine();
		
		bw.close();
		
		
		
	}

}
