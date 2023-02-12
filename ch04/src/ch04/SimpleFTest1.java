package ch04;
import java.util.Scanner;
public class SimpleFTest1 {
	public static void main(String args[])
	{//프로그램 시작
		Scanner stdin = new Scanner(System.in);
		System.out.print("한개의 숫자를 입력 : ");
		int count = stdin.nextInt();
		if (count < 0)
			System.out.println(count + "은(는) 음수입니다 "); 
	}//프로그램 끝
}
