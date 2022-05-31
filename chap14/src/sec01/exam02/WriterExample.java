package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		OutputStream oStream = new FileOutputStream("C:/Temp/test2.db");
		
		byte[] array = { 10, 20, 30 };
		
		oStream.write(array);
		
		oStream.flush();
		
		oStream.close();

	}

}
