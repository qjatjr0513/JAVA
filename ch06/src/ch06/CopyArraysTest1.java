package ch06;

public class CopyArraysTest1 {
	public static void main(String args[]) {
		int num1[] = {10,20,30};
		int num2[] = {40,50,60};
		num2 = num1;//배열명을 이용해서 복사하는경우 주소가 복사된다
		num2[2] = 200;//num2의 값을 변경하면 num1의 값도 변경된다(주소가 같아서)
		System.out.print("num1 배열의 값: ");
		for(int i:num1)
			System.out.print(i+" ");
		System.out.print("\nnum2 배열의 값: ");
		for(int i:num2)
			System.out.print(i+" ");
		int num3[] = {100,200,300};
		int num4[] = {400,500,600};
		for(int i = 0;i<num3.length;i++)
			num4[i]=num3[i];//배열을 요소 단위로 값을 복사하기때문에 각각의 요소가 복사된다
		num4[2]=999;//num4의 3번째 배열의 값만 999로 변경된다
		System.out.print("\nnum3 배열의 값: ");
		for(int i:num3)
			System.out.print(i+" ");
		System.out.print("\nnum4 배열의 값: ");
		for(int i:num4)
			System.out.print(i+" ");
	}
}
