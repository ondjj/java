package sec04;

public class Formating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��â��");
		System.out.print("��â��");
		System.out.print("��â��\n");
		System.out.printf("�̸�:%s ����:%d ���:%s \n", "��â��",28, "����");
		System.out.printf("�̸�: %2$s | �ּ� : %1$s | ��ȣ : %s \n", "��â��", "���� �ϱ�", "010-2251-6108");
		
		int a = 1241;
		//System.out.printf("���� ���ڿ�", ��1, ��2, ...);
		//�����ڰ� ���ϴ� ���ڿ� ���·� ����ϱ� ���� �޼ҵ�
		
		System.out.printf("%d \n", a);
		System.out.printf("%8d \n", a);
		System.out.printf("%-8d \n", a);
		System.out.printf("%08d \n", a);
		
		double b = 147.245;
		System.out.printf("%f \n",b);
		System.out.printf("%8.2f \n",b);
		System.out.printf("%-8.2f \n",b);
		System.out.printf("%08.2f \n",b);
		
		String c = "way";
		System.out.printf("%s \n",c);
		System.out.printf("%6s \n",c);
		System.out.printf("%-6s \n",c);
//		System.out.printf("%06s \n",c); ���ڿ��� 0�� ���̸� ������ �߻��Ѵ�.
		
		int prob = 123;
		System.out.printf("��ǰ�� ����:%d�� \n", prob);
		System.out.printf("��ǰ�� ����:%6d�� \n", prob);
		System.out.printf("��ǰ�� ����:%-6d�� \n", prob);
		System.out.printf("��ǰ�� ����:%06d�� \n", prob);
		
		double won = 314.16;
		System.out.printf("�������� %2$d�� ���� ����:%1$f \n",won, 10);
		System.out.printf("�������� %2$d�� ���� ����:%1$10.2f \n",won, 10);
		System.out.printf("�������� %2$d�� ���� ����:%1$-10.2f \n",won, 10);
		System.out.printf("�������� %2$d�� ���� ����:%1$010.2f \n",won, 10);
		
		String name = "jeon";
		String str = "����";
		
		System.out.printf("�̸� : %s\t �Ҽ� : %s",name,str);
		System.out.println();
		
		System.out.printf("��ǰ�� : %s\t| ���� : %4d��\t | ���� : %2d�� \n", "����", 500, 3);
		System.out.printf("��ǰ�� : %s\t| ���� : %4d��\t | ���� : %2d�� \n", "����", 1000, 10);
		
		double x = 1.23456;
		System.out.printf("�Ǽ�x�� �� :%8.3f \n", x);
		System.out.printf("�Ǽ�x�� �� :%-8.3f \n", x);
		System.out.printf("�Ǽ�x�� �� :%08.3f \n", x);

	}

}
