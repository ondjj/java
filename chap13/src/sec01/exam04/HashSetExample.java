package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // �ߺ� ���� ���� ����
		set.add("iBATIS");
		
		int size = set.size(); // ����� ��ü �� ���
		System.out.println("�� ��ü��: " + size);
		
		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) { // ��ü �� ��ŭ ����
			String element = iterator.next(); // 1���� ��ü ������
			System.out.println("\t" + element);
		}
		
		set.remove("JBDC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü��: " + set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // ��� ��ü ����
		if(set.isEmpty()) { System.out.println("��� ����"); }
				

	}

}
