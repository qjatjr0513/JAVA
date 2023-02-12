package ch05;
import java.util.Scanner;
public class ContinueTest1 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 정수 입력(짝수의 합) : ");
		int num = stdin.nextInt();
		int i, sum=0;
		for (i=1 ; i<=num ; i++)
		{
			if( i % 2 == 1)continue; // i%2 == 1(나머지가 1이면 홀수) i%2 == 0(나머지가 0이면 짝수) continue = 반복을 계속 하세요
			sum = sum + i;
		}
		System.out.println("1부터 " +num+ "까지의 짝수의 합 = " + sum);
	}
}
