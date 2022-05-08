class Ex2_9 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";
		float f1 = .10f;   // 0.10, 1.0e-1
		float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url);  // 왼쪽에서 8글자만 출력
		
		System.out.println("-----------------------");
		String url1 = "www.django.com";
		float x1 = .10f;	// 0.10, 1.0e-1
		float x2 = 1e1f;	// 10.0, 1.0e1, 1.0e+1
		float x3 = 3.14e3f;
		double x = 1.23456789;
		System.out.printf("x1=%f, %e, %g%n", x1, x1, x1);
		System.out.printf("x2=%f, %e, %g%n", x2, x2, x2);
		System.out.printf("x3=%f, %e, %g%n", x3, x3, x3);
		System.out.printf("x=%f%n", x);
		System.out.printf("x=%14.10f%n", x);
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("%s%n", url1);
		System.out.printf("[%20s]%n", url1);
		System.out.printf("[%-20s]%n", url1);
		System.out.printf("[%-30s]%n", url1);
		System.out.printf("[%.10s]%n", url1);
		
	}
}