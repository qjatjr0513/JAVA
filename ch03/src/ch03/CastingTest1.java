package ch03;

public class CastingTest1 {
	public static void main(String args[])
	{
		byte b = 120;
		int i = b;
		System.out.println("확대 형 변환 : "+i);
		int j = 259;
		double d = 259.428;
		System.out.println("축소 형 변환 결과");
		b = (byte) j;//100000011 = 00000011 = 3
		System.out.println("int 259를 byte로 : "+b);
		i = (int) d;
		System.out.println("double 259.428을 int로 : "+i);//259
		b = (byte) d;
		System.out.println("double 259.428을 byte로 : "+b);//3
	}
}
