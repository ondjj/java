package sec01.exam01;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); // String object save
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		list.add("iBATIS");
		
		int size = list.size(); // object save length to array 
		System.out.println("ÃÑ °´Ã¼¼ö: " + size);
		System.out.println();
		
		String skill = list.get(2); // get index number two
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2); // remove to index number two
		list.remove(2); // remove to pushing number two index
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
