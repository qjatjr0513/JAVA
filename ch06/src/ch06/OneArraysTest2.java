package ch06;

public class OneArraysTest2 {
	public static void main(String args[]) {
		String slist[] = {"seoul","daejeon","daegu","kwangju","incheon","jeju","busan"};
		System.out.print("원래의 배열: ");
		for (String s:slist)
			System.out.print(s+" ");
		System.out.println();
		for(int i=0;i<slist.length/2;i++)//배열 길이의 반에 해당되는 횟수만큼 교환. 개수가 홀수인 경우는 가운데는 바꾸지 않는다
		{
			String temp = slist[i];
			slist[i] =slist[slist.length-i-1];
			slist[slist.length-i-1]=temp;
		}
		System.out.print("역순으로 재배치된 배열: ");
		for(String s:slist)
			System.out.print(s+" ");
	}
}
