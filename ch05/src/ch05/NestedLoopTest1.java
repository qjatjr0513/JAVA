package ch05;

public class NestedLoopTest1 {
	public static void main(String args[])
	{
		int i=2;
		while( i <= 3 )
		{
			System.out.println("*** "+ i +" ´Ü ***");
			for (int j = 1; j<=9; j++)
			{
				System.out.println((i+" * " + j + " = " + i*j));
			}
			System.out.println();
			i++;
		}
	}
}
