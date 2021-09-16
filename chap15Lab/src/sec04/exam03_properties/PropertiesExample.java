package sec04.exam03_properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");//예외 떠넘기기, 파일 경로상에 한글이 있을 수 있기 때문
		properties.load(new FileReader(path));//파일 읽어올 수 있음

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password"); 
		
		System.out.println("driver: "+driver);
		System.out.println("url: "+url);
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		
	}

}
