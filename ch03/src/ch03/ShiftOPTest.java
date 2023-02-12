package ch03;
import java.util.Scanner;
public class ShiftOPTest {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("두 개의 숫자를 입력 : ");
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		System.out.println("a=" +a+ "("+Integer.toBinaryString(a)+")");//0101
		System.out.println("b=" +b+ "("+Integer.toBinaryString(b)+")");//1000
		System.out.println("a<<2=" +(a<<2)+ "("+Integer.toBinaryString(a<<2)+")");//1010 10100(16+4=20)
		System.out.println("a>>2=" +(a>>2)+ "("+Integer.toBinaryString(a>>2)+")");//0001(1)
		System.out.println("b<<2=" +(b<<2)+ "("+Integer.toBinaryString(b<<2)+")");//11...111000  1(-)1...11100000(32)= -32
		System.out.println("b>>2=" +(b>>2)+ "("+Integer.toBinaryString(b>>2)+")");//11...111000 1(-)1..1110(2)= -2
		System.out.println("b>>>2=" +(b>>>2)+ "("+Integer.toBinaryString(b>>>2)+")");
	}
}
