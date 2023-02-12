package ch06;
import java.util.Random;
public class MultiArraysTest1 {
	public static void main(String args[]) {
		Random ran = new Random();
		int [][] score = new int[4][4];//2차원 배열 score 생성
		for(int i=0;i<4;i++)//score 배열을 0~9사이의 정수 난수로 초기화
			for(int j=0;j<4;j++)
				score[i][j]=ran.nextInt(10);
		
		for(int k=0;k<4;k++) {
			int sum=0;//각 행의 합계를 구하기위해 sum변수를 0으로 생성
			for(int value:score[k]) {
				System.out.print(value+" ");
				sum=sum+value;
			}
			System.out.println("의 합계는 "+sum);
		}
	}
}
