package ch05;
import java.util.Scanner;
public class ContinueTest1 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է�(¦���� ��) : ");
		int num = stdin.nextInt();
		int i, sum=0;
		for (i=1 ; i<=num ; i++)
		{
			if( i % 2 == 1)continue; // i%2 == 1(�������� 1�̸� Ȧ��) i%2 == 0(�������� 0�̸� ¦��) continue = �ݺ��� ��� �ϼ���
			sum = sum + i;
		}
		System.out.println("1���� " +num+ "������ ¦���� �� = " + sum);
	}
}
