class Ex3_2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i++;
		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);

		i=5;        // ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		j=0;

		j = ++i;
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
		
		System.out.println("-------------");
		
		int z=3, d=0;
		
		d = z++;
		System.out.println("d=z++; ���� ��, z=" + z + ", d="+d);
		
		z = 3;
		d = 0;
		
		d = ++z;
		System.out.println("d=++z; ���� ��, z=" + z +", d="+ d);
	}
}