package ch06;
import java.util.Random;
public class MultiArraysTest1 {
	public static void main(String args[]) {
		Random ran = new Random();
		int [][] score = new int[4][4];//2���� �迭 score ����
		for(int i=0;i<4;i++)//score �迭�� 0~9������ ���� ������ �ʱ�ȭ
			for(int j=0;j<4;j++)
				score[i][j]=ran.nextInt(10);
		
		for(int k=0;k<4;k++) {
			int sum=0;//�� ���� �հ踦 ���ϱ����� sum������ 0���� ����
			for(int value:score[k]) {
				System.out.print(value+" ");
				sum=sum+value;
			}
			System.out.println("�� �հ�� "+sum);
		}
	}
}
