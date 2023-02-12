package ch06;
import java.util.Arrays;
public class ArraysCMethodTest1 {
	public static void main(String[] args) {
		int[] int1 = {9,1,7,3,5,4,6,2,8,0};
		System.out.println("초기배열: "+Arrays.toString(int1));//배열의 요소를 출력
		Arrays.fill(int1,3,5,33);//int1의 int[3]과 int[4]를 33으로 바꾼다
			System.out.println("fill() 수행 후: "+Arrays.toString(int1));
			Arrays.sort(int1);//int1 배열을 오름차순으로 정렬
			System.out.println("sort() 수행 후: "+Arrays.toString(int1));
			System.out.println("33은 배열의 "+Arrays.binarySearch(int1, 33)+"번째 요소");//정렬된 int1 배열에서 33의 위치를 찾는다.2진 탐색
			int[] int2 = {5,4,3,2,1};
			System.out.println("두 번째 배열: "+Arrays.toString(int2));
			System.out.println("두 개의 배열이 같은가? "+Arrays.equals(int1,int2));//int1과 int2가 같은가? false를 출력
			int[] int3 = new int[5];//5개의 요소를 가진 빈 배열을 선언
			System.arraycopy(int2, 0, int3, 0, 5);//배열을 복사
			System.out.println("복사된 배열: "+Arrays.toString(int3));
		}
	}

