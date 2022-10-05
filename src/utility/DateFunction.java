package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunction {

	

   
	
	public  String getCurrentDateTime() {

	     String pattern = "MMddyyyyhhmmss";
	     SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	     
	     String date = simpleDateFormat.format(new Date());
	    return(date);
	}
	
	
	
	
	
	
}
