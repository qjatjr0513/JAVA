package ch04;
import java.util.Scanner;
public class SimpleIFtest3 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		int grade = stdin.nextInt();
		if (grade >= 90)
		{
			System.out.println("�����մϴ� ");
			System.out.println("A������ ����м̽��ϴ� ");
		}
		System.out.println("�����մϴ�");
	}
}
