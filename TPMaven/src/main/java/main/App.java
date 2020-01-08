package main;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	System.out.println("Hello World");
    	System.out.println("Hi it's Hind from Morocco");
	    
	    
    	DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    	Date date1 = null;
		try {
			date1 = format.parse("26/10/1985");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Client clt = new Client("12aytt", "smith", "will", "smith@gmail.com", "124789", date1, "066167897", false, 100);
    	
    	int age = clt.CalAge();
    	System.out.println(age);
    	
    }
    
       
		
        
}
        
  
  

