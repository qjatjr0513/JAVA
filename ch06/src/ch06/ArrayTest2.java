package ch06;

public class ArrayTest2 {
	public static void main(String args[]) {
		int score[] = {88,97,53,62,92,68,82};
		int max = score[0];
		for(int i: score)
			//���� for�� : for(int i=1;i<score.length;i=i+1)
		{
			if(i>max)
				//������ for���� ����� ���� if��: if(score[i]>max)
				max=i;
			//max = score[i];
		}
		System.out.println("�迭 ����� �ִ밪�� "+max+"�Դϴ�");
	}
}
