package genric_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile_utility
{
	public String readdatafromproprtyfile(String key ) throws IOException
	{
		FileInputStream fis=new FileInputStream(".//src//test//resources//propertyfile.properties");
		 Properties pobj=new Properties();
		 pobj.load(fis);
		String value= pobj.getProperty(key);
		return value;
		 
		
	}
	
	}


