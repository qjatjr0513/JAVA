package ch03;

public class ByteTypeTest {
	public static void main(String args[])
	{
		byte a = (byte)128;//10000000 01111111+1 10000000= (-)128
		System.out.println("128�� ������ byte ����: " + a);
		byte b = (byte)256;//100000000 1x 00000000=0
		System.out.println("256�� ������ byte ����: " + b);
	}
}
