package ch03;

public class StringTest1 {
	public static void main(String args[])
	{
		String str1 = "��! ���ѹα�";
		String str2 = "korea";
		System.out.println(str1 + str2);
		System.out.println("��! ���ѹα� \nkorea");
		int a = 1000;
		int b = 2000;
		System.out.println(str1 + a + b +"�� �ݼ�����");// a, b�� ���������� ��ȯ 10002000
		System.out.println(str1 + (a + b) +"�� �ݼ�����");//(1000+2000)=3000-> ���������� ��ȯ
		System.out.println( a + b +"�� �ݼ�����");//������ ������ ������ ���� ����
		System.out.println('3' + "õ�� �ݼ�����");
		System.out.println('3' + 2997 +"�� �ݼ�����");// '3' = 51 51+2997= 3848
	}
}
