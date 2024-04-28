package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {
	
	public static void main(String[] args) throws IOException {
		//this is useful as configar reading of the file.
		FileReader fr = new FileReader("C:\\Users\\Umesh\\eclipse-workspaceJuly20\\TestAutomationFrameWork\\src\\test\\resources\\configfiles\\config.properties");
		Properties p = new Properties(); 
		p.load(fr);
		
		//to get the values from cofig.properties file (key value fair like browser=chrome)
		System.out.println(p.getProperty("browser")); //string key
		System.out.println(p.getProperty("testurl"));
	}

}
