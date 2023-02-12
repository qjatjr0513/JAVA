package ch05;

public class DoWhileTest1 {
	public static void main(String args[])
	{
		int hap = 0, count = 1;
		do
		{
			hap = hap + count; // 0+1=1 hap=1 1+2=3 3+3=6 6+4=10
			count = count + 1; // 1+1=2 count=2 2+1=3 3+1=4 
		}while(count <= 4);
		System.out.println("1 부터 4까지의 합은 "+ hap +" 입니다");
	}
}
