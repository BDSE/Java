/**
 * this example uses a prperties file and fetches data out of that
 * also shows the runtime class
 */
package examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassExample {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("db.properties");
		
		Properties pr = new Properties();
		pr.load(fr);
		
		System.out.println("userName is : "+pr.getProperty("userName")+" password is : "+ pr.getProperty("password"));
		
		System.out.println("Available memory is : "+ Runtime.getRuntime().totalMemory()+" free memory is : "+Runtime.getRuntime().availableProcessors());
	}

}
