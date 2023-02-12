package ch03;

public class StringTest1 {
	public static void main(String args[])
	{
		String str1 = "아! 대한민국";
		String str2 = "korea";
		System.out.println(str1 + str2);
		System.out.println("아! 대한민국 \nkorea");
		int a = 1000;
		int b = 2000;
		System.out.println(str1 + a + b +"리 금수강산");// a, b는 문자형으로 변환 10002000
		System.out.println(str1 + (a + b) +"리 금수강산");//(1000+2000)=3000-> 문자형으로 변환
		System.out.println( a + b +"리 금수강산");//정수형 변수의 덧셈이 먼저 나옴
		System.out.println('3' + "천리 금수강산");
		System.out.println('3' + 2997 +"리 금수강산");// '3' = 51 51+2997= 3848
	}
}
