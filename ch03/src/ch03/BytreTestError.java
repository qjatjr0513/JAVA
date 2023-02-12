package ch03;

public class BytreTestError {
	public static void main(String[] args) {
		byte a = (byte)128; // 1000 0000
		//1000 0000 --> 0111 1111(127) 1000 0000 -> 음수
		// 1의 보수 0111 1111 + 1 = 1000 0000 (크기 128) 부호 -
		System.out.println("128을 저장한 byte 값은 : " + a );
		
		byte b = (byte) 256; // 1 0000 0000
		System.out.println("256을 저장한 byte 값은 : " + b );
	}
}
