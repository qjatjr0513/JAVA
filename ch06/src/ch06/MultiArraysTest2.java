package ch06;

public class MultiArraysTest2 {
	public static void main(String args[]) {
		int twoD[][] = new int[4][];//2���� �迭�� ����
		twoD[0] = new int[1];//�� �࿡ �ش��ϴ� 1���� �迭�� ����
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		System.out.println("2���� �迭���� ���� ���̴�: "+twoD.length);//�迭�� ���̸� ���
		System.out.println("ù ��° ���� ��� ����: "+twoD[0].length);
		System.out.println("�� ��° ���� ��� ����: "+twoD[1].length);
		System.out.println("�� ��° ���� ��� ����: "+twoD[2].length);
		System.out.println("�� ��° ���� ��� ����: "+twoD[3].length);
		int i,j,k=0;
		for(i=0;i<twoD.length;i++)//�迭�� ��Ҹ� �ʱ�ȭ(0���� 1�� �������Ѱ��� ����)
			for(j=0;j<twoD[i].length;j++)
			{
				twoD[i][j] =k;
				k++;
			}
		for(i=0;i<twoD.length;i++)
		{
			for(int val:twoD[i])//�迭�� ���
				System.out.print(val+" ");
			System.out.println();
		}
	}
}