package externalFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {

	public static void main(String[] args) throws IOException {

	String path="data\\abc.xlsx";
	
	XSSFWorkbook wb= new XSSFWorkbook();
	XSSFSheet s1=  wb.createSheet("Techfios");
	XSSFSheet s2=  wb.createSheet("Java");

	Row r5=s2.createRow(4);
	Cell c5=r5.createCell(1);
	c5.setCellValue("Hello excel");
	
	
	File f=new File(path);
	FileOutputStream fo=new FileOutputStream(f);
	wb.write(fo);
	fo.close();
	
	System.err.println("test");
	}

}
