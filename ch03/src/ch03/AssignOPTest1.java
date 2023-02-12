package ch03;

public class AssignOPTest1 {
	public static void main(String args[])
	{
		int a = 10;
		System.out.println("a="+a);
		a+=4;
		System.out.println("a += 4의 결과" + a);//10+4=14
		a%=4;
		System.out.println("a%=4의 결과" + a);//14%4=2
		a <<= 4;
		System.out.println("a <<= 4의 결과" + a);//2^4=32
		boolean b = false;
		b &= a > 2;
		System.out.println("b &= a > 2의 결과" + b);// b = b & a>2 false true &(and)=false
		b |= a > 2;
		System.out.println("b |= a > 2의 결과" + b);// b = b | a>2 flase true |(or)=true 
	}
}
