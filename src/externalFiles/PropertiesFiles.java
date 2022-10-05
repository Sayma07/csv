package externalFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFiles {

	public static void main(String[] args) {

System.out.println(getPropValue("C:\\Users\\nazmu\\eclipse-workspace_April_2022\\Class10\\data\\test.properties","username"));
}

	
	
	
	
	
public static String getPropValue(String path, String key) {
	try {
		//String path="C:\\Users\\nazmu\\eclipse-workspace_April_2022\\Class10\\data\\test.properties"	;

		
		
		Properties prop=new Properties ();
        FileInputStream fs= new FileInputStream(path);
		                                                      //either try{}catch(){} or throw(IOException) 
        prop.load(fs);
        //System.out.println(prop.getProperty(key).toUpperCase());	
        return prop.getProperty(key).toUpperCase();
		}
		
	catch(IOException e) {
			System.out.println("something went wrong with the file");
			return "Exception Caught"	;	
	
	
	}
	
	
	

	

}

}
