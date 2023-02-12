package ch05;

public class ForTest1 {
	public static void main(String args[])
	{
		int i, sum=0;
		for (i = 1; i <=4 ; i++)
		{
			sum = sum + i;
		}
		System.out.println("1부터 4까지의 합은 " + sum + " 입니다");
	}
}
