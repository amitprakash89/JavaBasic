package control.properties;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class StoringXML {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Properties props = new Properties();
		props.setProperty("displayName", "Amit Prakash");
		props.setProperty("accountNumber", "123-45-6789");
		try(OutputStream out = Files.newOutputStream(
		Paths.get("props1.xml"))) {
		props.storeToXML(out, "My comment");
		}
	}

}
