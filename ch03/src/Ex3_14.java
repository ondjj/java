class Ex3_14 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); 
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		System.out.println("--------------------------------------");
		
		String str3 = "aaa";
		String str4 = new String("aaa");
		
		System.out.printf("\"aaa\"==\"aaa\" ? %b%n", "aaa" == "aaa");
		System.out.printf("str3==\"aaa\" ? %b%n", str3 == "aaa");
		System.out.printf("str4==\"aaa\" ? %b%n", str4 == "aaa");
		System.out.printf("str3.equals(\"aaa\") ? %b%n", str3.equals("aaa"));
		System.out.printf("str4.equals(\"aaa\") ? %b%n", str4.equals("aaa"));
		System.out.printf("str4.equals(\"AAA\") ? %b%n", str4.equals("AAA"));
		System.out.printf("str4.equalsIgnoreCase(\"AAA\") ? %b%n", str4.equalsIgnoreCase("AAA"));
	}
}