package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import utility.DateFunction;

public class WriteHtmlFile {

	public static void main(String[] args) throws IOException {
		
		
		String path="C:\\Users\\nazmu\\eclipse-workspace_April_2022\\Class10\\data\\xyz.html";
		
		File f= new File(path);                             //pointing the path of xyz;
	    FileWriter fw=new FileWriter(f);            //(f.true means it will add the writing not override)
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		
		bw.write("<html>");
		bw.newLine();
		bw.write("<head>");
		bw.newLine();
		bw.write("<Title>Java Website</title>");
		bw.newLine();
		bw.write("</head>");
		bw.newLine();
		bw.write("<body bgcolor=\"skyblue\">");
		bw.newLine();
		bw.write("<p>Hello baby <b>this </b> is a paragraph</p>");
		bw.newLine();
		bw.write("</body>");
		bw.newLine();
		bw.write("</html>");
		
		bw.close();
		
	}

}
