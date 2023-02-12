package ch06;
import java.util.Scanner;
public class OneArraysTest1 {
	public static void main(String args[]) {
		int inum[]= {8,7,3,6,9,6,8,7,0,4,1,2};
		Scanner stdin = new Scanner(System.in);
		System.out.print("찾고 싶은 숫자 입력: ");
		int key = stdin.nextInt();
		int count = 0;//횟수를 저장하기 위한 변수 선언
		for(int i=0;i<inum.length;i++)//위치를 알아내야 하기 때문에 확장된 for문 사용불가
		{
			if(inum[i]==key) {//값이 지정된 값과 일치하면 count값을 증가하고 출력
				count++;
				System.out.println((i+1)+"번째 데이터와 일치");
			}
		}
		if(count==0)//값이 없을 경우 값이 없음을 출력
			System.out.println(key+"값은 배열에 없습니다");
		else//값이 있는경우 배열에서 나타난 횟수를 출력
			System.out.println(key+"값은 배열에 "+count+"개 있습니다");
	}
}
