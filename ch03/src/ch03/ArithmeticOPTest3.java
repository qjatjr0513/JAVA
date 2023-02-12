package ch03;

public class ArithmeticOPTest3 {
	public static void main(String args[])
	{
		int a = 10;
		System.out.println("(++a + ++a)의 결과는 : " + (++a + ++a));//11+12=23
		a=10;
		System.out.println("(++a - ++a)의 결과는 : " + (++a - ++a));//11-12=-1
		a=10;
		System.out.println("(a++ + a++)의 결과는 : " + (a++ + a++));//10+11=21
		a=10;
		System.out.println("(a++ - a++)의 결과는 : " + (a++ - a++));//10-11=-1
		a=10;
		System.out.println("(++a + a++)의 결과는 : " + (++a + a++));//11+11=22
		a=10;
		System.out.println("(++a - a++)의 결과는 : " + (++a - a++));//11-11=0
		a=10;
		System.out.println("(a++ + ++a)의 결과는 : " + (a++ + ++a));//10+12=22
		a=10;
		System.out.println("(a++ - ++a)의 결과는 : " + (a++ - ++a));//10-12=-2
		
	}
}
