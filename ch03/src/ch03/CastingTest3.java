package ch03;

public class CastingTest3 {
	public static void main(String args[]) {
		long l = 1234567890123456789L;
		float f = l;
		double d = l;
		System.out.println("원래의 long 값 : "+l);
		System.out.println("long >> float로 변환 : "+f);
		System.out.println("long >> double로 변환 : "+d);
		long f1 = (long)f;
		long d1 = (long)d;
		System.out.println("long >> float >> long로 변환 : "+f1);
		System.out.println("long>> double >> long로 변환 : "+d1);
	}

}
