package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTextFileByarrayList {

	public static void main(String[] args) throws IOException {

		List <String> ml = new ArrayList <String>();		
		String path="C:\\Users\\nazmu\\eclipse-workspace_April_2022\\Class10\\data\\xyz.txt";
		
	File f=new File(path);
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	
	
	String line="";
	
	while((line=br.readLine())!=null) {
		ml.add(line);
	}
	System.out.println(ml);
	System.out.println(ml.get(1));
	
	}

}
