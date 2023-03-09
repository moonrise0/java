package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		try (FileInputStream in = new FileInputStream(fileName)) {
			props.load(in);

		} catch (IOException e) {
			System.out.println("문제발생");
			return; //함수를 끝내라 문제가 발생했으니
			
		}
		String ip = props.getProperty("IP_ADDR");
		int port = Integer.parseInt(props.getProperty("PORT")); // 글자로 받은걸 숫자로.
		System.out.printf("/% 서버로 %d 포트로 접속", ip ,port);
	}

}
//		} finally {
////			try {
////				if(in != null) {
////				in.close();
////				}
////			} catch (IOException e) {
////				e.printStackTrace();
////			} //정상적으로 끝나도 비정상으로 끝나도
////		}
