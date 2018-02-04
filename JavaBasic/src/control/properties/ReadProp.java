package control.properties;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		try(Reader reader = Files.newBufferedReader(
		Paths.get("myapp.properties"))) {
		props.load(reader);
		}
		String val1 = props.getProperty("val1");
		String val2 = props.getProperty("val2");
		String val3 = props.getProperty("val3");
		String val4 = props.getProperty("val4");
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
	}

}
