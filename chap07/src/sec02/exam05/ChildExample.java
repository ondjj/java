package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.fiedl1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "Data2";
		 * parent.method3(); --> ºÒ°¡´É*/
		
		Child child = (Child) parent;
		child.method3();

	}

}
