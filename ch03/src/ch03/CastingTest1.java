package ch03;

public class CastingTest1 {
	public static void main(String args[])
	{
		byte b = 120;
		int i = b;
		System.out.println("Ȯ�� �� ��ȯ : "+i);
		int j = 259;
		double d = 259.428;
		System.out.println("��� �� ��ȯ ���");
		b = (byte) j;//100000011 = 00000011 = 3
		System.out.println("int 259�� byte�� : "+b);
		i = (int) d;
		System.out.println("double 259.428�� int�� : "+i);//259
		b = (byte) d;
		System.out.println("double 259.428�� byte�� : "+b);//3
	}
}
