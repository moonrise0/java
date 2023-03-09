package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName); //파이프 꽂았고 나중에 닫아줘야함. 
			props.load(in);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			} //정상적으로 끝나도 비정상으로 끝나도
		}

		String ip = props.getProperty("IP_ADDR");
		System.out.println(ip);
	}

}
