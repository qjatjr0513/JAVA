package ch05;
import java.util.Scanner;
public class BreakTest1 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("�հ踦 ���ϴ� ���� �Է� : ");
		int num = stdin.nextInt();
		int sum = 0, i = 1;
		while (true) {
			sum = sum + i; // 0+1=1 1+2=3 3+3=6 6+4=10 10+5=15
			if (i == num) break;
			i++;
		}
		System.out.println(num+"������ �հ�� ="+sum);
	}
}
