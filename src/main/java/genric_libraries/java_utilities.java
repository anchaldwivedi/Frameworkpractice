package genric_libraries;

import java.util.Date;
import java.util.Random;

public class java_utilities 
{

public  String getcurrentdate()
{
	Date d=new Date();
	String date=d.toString();
	return date;
		
}
public int getrandomnumber()
{
	Random r= new Random();
	 int randomnumber = r.nextInt(1000);
	return randomnumber;
}

}
