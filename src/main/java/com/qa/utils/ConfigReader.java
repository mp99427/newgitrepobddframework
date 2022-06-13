package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	private File file;
	FileInputStream fis;

	public Properties init_prop() throws FileNotFoundException {
		prop = new Properties();
		file = new File(".\\src\\test\\resources\\config\\config.properties");
		fis = new FileInputStream(file);
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;
	}
}