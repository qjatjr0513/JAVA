package ch06;

public class MultiArraysTest2 {
	public static void main(String args[]) {
		int twoD[][] = new int[4][];//2차원 배열을 선언
		twoD[0] = new int[1];//각 행에 해당하는 1차원 배열을 생성
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		System.out.println("2차원 배열에서 행의 길이는: "+twoD.length);//배열의 길이를 출력
		System.out.println("첫 번째 행의 요소 수는: "+twoD[0].length);
		System.out.println("두 번째 행의 요소 수는: "+twoD[1].length);
		System.out.println("세 번째 행의 요소 수는: "+twoD[2].length);
		System.out.println("네 번째 행의 요소 수는: "+twoD[3].length);
		int i,j,k=0;
		for(i=0;i<twoD.length;i++)//배열의 요소를 초기화(0부터 1씩 증가시켜가며 저장)
			for(j=0;j<twoD[i].length;j++)
			{
				twoD[i][j] =k;
				k++;
			}
		for(i=0;i<twoD.length;i++)
		{
			for(int val:twoD[i])//배열을 출력
				System.out.print(val+" ");
			System.out.println();
		}
	}
}
