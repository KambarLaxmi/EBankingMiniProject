package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties ConfigRead(Properties prop) throws IOException {
		FileInputStream i = new FileInputStream(
				"C:\\Users\\kamba\\Desktop\\2023SeleniumPractice\\EBankingProject\\src\\test\\resources\\ConfigFiles\\config.properties");
		prop = new Properties();
		prop.load(i);
		return prop;

	}

}
