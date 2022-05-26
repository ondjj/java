package sec01.exam05;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("È«±æµ¿", 30));
		
		System.out.println("ÃÑ °´Ã¤¼ö :" + set.size());

	}

}
