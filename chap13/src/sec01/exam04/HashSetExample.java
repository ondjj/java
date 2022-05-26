package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 저장 되지 않음
		set.add("iBATIS");
		
		int size = set.size(); // 저장된 객체 수 얻기
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) { // 객체 수 만큼 루핑
			String element = iterator.next(); // 1개의 객체 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("JBDC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // 모든 객체 제거
		if(set.isEmpty()) { System.out.println("비어 있음"); }
				

	}

}
