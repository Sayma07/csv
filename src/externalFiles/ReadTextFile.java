package externalFiles;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

import utility.DateFunction;

public class ReadTextFile {

public static void main(String[] args) throws IOException {

	
		
		
String path="C:\\Users\\nazmu\\eclipse-workspace_April_2022\\Class10\\data\\xyz.txt";
		
		File f= new File(path);                             //pointing the path of xyz;
	    FileReader fr=new FileReader(f);            //(f.true means it will add the writing not override)
		BufferedReader br=new BufferedReader(fr);
		
		
	
	//	System.out.println(br.readLine());
		

		String line="";
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		
		
	}

}
