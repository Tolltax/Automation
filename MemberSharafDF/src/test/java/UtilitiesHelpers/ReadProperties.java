package UtilitiesHelpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {


	String  Filename = "C:\\Users\\kumar\\git\\Automation\\MemberSharafDF\\Config\\config.properties";


	public Properties ReadPropertiesFile() throws IOException {

		Properties prop = null;

		try {

			FileInputStream fis = new FileInputStream(Filename);
			prop = new Properties();
			prop.load(fis);

		}
		catch(FileNotFoundException e) {

			e.printStackTrace();

		}catch(IOException ioe) {
			ioe.printStackTrace();

		}

		return prop;

	}


}

