package ch03;

public class CastingTest3 {
	public static void main(String args[]) {
		long l = 1234567890123456789L;
		float f = l;
		double d = l;
		System.out.println("������ long �� : "+l);
		System.out.println("long >> float�� ��ȯ : "+f);
		System.out.println("long >> double�� ��ȯ : "+d);
		long f1 = (long)f;
		long d1 = (long)d;
		System.out.println("long >> float >> long�� ��ȯ : "+f1);
		System.out.println("long>> double >> long�� ��ȯ : "+d1);
	}

}
