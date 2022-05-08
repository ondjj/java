class Ex3_6 {
	public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d%n",  a, b, a + b);
		System.out.printf("%d - %d = %d%n",  a, b, a - b);
		System.out.printf("%d * %d = %d%n",  a, b, a * b);
		System.out.printf("%d / %d = %d%n",  a, b, a / b);
		System.out.printf("%d / %f = %f%n",  a, (float)b, a / (float)b);
		
		System.out.println("-------------------------");
		
		int x = 20;
		int z = 5;
		
		System.out.printf("%d + %d = %d%n", x, z, x + z);
		System.out.printf("%d - %d = %d%n", x, z, x - z);
		System.out.printf("%d * %d = %d%n", x, z, x * z);
		System.out.printf("%d / %d = %d%n", x, z, x / z);
		System.out.printf("%d / %f = %f%n", x, (float)z, x / (float)z);
	}
}