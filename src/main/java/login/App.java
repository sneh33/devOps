package login;

import java.io.FileInputStream;
import java.util.Properties;

public class App {
	
	public boolean userLogin(String userName,String passWord) {
	Properties prop=new Properties();
	
	try {
		prop.load(new FileInputStream("src/main/resources/credentials.property"));
	}
	catch(Exception e){
		System.out.println("Error in reading the file");
	}
	
	String un=prop.getProperty("username");
	String pwd=prop.getProperty("password");
	
	if(userName.contentEquals(un) && passWord.equals(pwd))
		return true;
	else
		return false;

	}
}
