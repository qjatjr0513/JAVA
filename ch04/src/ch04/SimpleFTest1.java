package ch04;
import java.util.Scanner;
public class SimpleFTest1 {
	public static void main(String args[])
	{//���α׷� ����
		Scanner stdin = new Scanner(System.in);
		System.out.print("�Ѱ��� ���ڸ� �Է� : ");
		int count = stdin.nextInt();
		if (count < 0)
			System.out.println(count + "��(��) �����Դϴ� "); 
	}//���α׷� ��
}
