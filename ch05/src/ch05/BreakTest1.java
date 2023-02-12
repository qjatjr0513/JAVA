package ch05;
import java.util.Scanner;
public class BreakTest1 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("합계를 원하는 정수 입력 : ");
		int num = stdin.nextInt();
		int sum = 0, i = 1;
		while (true) {
			sum = sum + i; // 0+1=1 1+2=3 3+3=6 6+4=10 10+5=15
			if (i == num) break;
			i++;
		}
		System.out.println(num+"까지의 합계는 ="+sum);
	}
}
