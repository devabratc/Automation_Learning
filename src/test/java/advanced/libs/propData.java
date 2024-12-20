package advanced.libs;

import java.util.Properties;

import com.framework.utils.ReadProp;

public class propData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = ReadProp.readData("Config.properties");
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		

	}

}
