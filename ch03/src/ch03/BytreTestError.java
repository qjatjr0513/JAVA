package ch03;

public class BytreTestError {
	public static void main(String[] args) {
		byte a = (byte)128; // 1000 0000
		//1000 0000 --> 0111 1111(127) 1000 0000 -> ����
		// 1�� ���� 0111 1111 + 1 = 1000 0000 (ũ�� 128) ��ȣ -
		System.out.println("128�� ������ byte ���� : " + a );
		
		byte b = (byte) 256; // 1 0000 0000
		System.out.println("256�� ������ byte ���� : " + b );
	}
}
