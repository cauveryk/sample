package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Proreader {
	static File pf;
	static FileInputStream fis;
	static Properties pro;
	public static String getlocator(String key) 
	{
		File pf=new File("C:\\Users\\CHAN\\eclipse-workspace\\Project\\src\\utility\\object.properties");
		try
		{
			fis=new FileInputStream(pf);
			pro=new Properties();
			try
			{
	        pro=new Properties();
	        pro.load(fis);
		    }
		    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		     }
		  }	catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return pro.getProperty(key);
		
		
	}

}
