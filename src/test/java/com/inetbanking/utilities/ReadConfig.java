package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {

	

	  private static Properties prop = new Properties();
	  private static InputStream input = null;

	  static {
	    try {
	      input = new FileInputStream("./Configuration/config.properties");
	      prop.load(input);
	    } catch (IOException ex) {
	      ex.printStackTrace();
	    } finally {
	      if (input != null) {
	        try {
	          input.close();
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	  }



	public String getApplicationURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username = prop.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}

	public String getChromePath() {
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}

	public String getIEPath() {
		String iepath = prop.getProperty("iepath");
		return iepath;
	}

	public String getFirefoxPath() {
		String firefoxpath = prop.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getEdgePath() {
		String edgepath = prop.getProperty("edgepath");
		return edgepath;
	}

}
