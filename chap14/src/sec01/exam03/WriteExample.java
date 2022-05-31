package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream oStream = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = { 10, 20, 30, 40, 50};
		
		oStream.write(array, 1, 3);
		
		oStream.flush();
		oStream.close();

	}

}
