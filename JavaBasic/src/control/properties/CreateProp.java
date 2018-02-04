package control.properties;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class CreateProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
 * 
 * it will create new xyz.properties file in the project folder
 */
		
		Properties props = new Properties();
		props.setProperty("displayName", "Amit Prakash");
		props.setProperty("accountNumber", "123-45-6789");
		try(Writer writer = Files.newBufferedWriter(
		Paths.get("xyz.properties"))) {
		props.store(writer, "My comment");
		}
	}

}
