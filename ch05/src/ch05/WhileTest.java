package ch05;

public class WhileTest {
	public static void main(String args[])
	{
		int hap = 0, count = 1;
		while (count <= 10)
		{
			hap = hap + count;
			count = count + 1;
		}
		System.out.println("1���� 10������ ���� "+ hap +" �Դϴ�");
	}
}
