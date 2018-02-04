package control.properties;

import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.setProperty("displayName", "Amit Prakash");
		String name = props.getProperty("displayName");
		String acctNum = props.getProperty("accountNumber");
		String nextPosition = props.getProperty("position", "1");
	}

}
