package ch06;
import java.util.Arrays;
public class ArraysCMethodTest2 {
	public static void main(String args[]) {
		String[] array1 = {"IMF","제주도","자바도사","한글나라","Computer","모카","JAVA","인터넷탐색","초롱초롱","come","바람","스크립터","군고구마","도서","their","country"};//16개의 문자열 요소를 가진 배열 생성
		System.out.println("======= 정렬 전 데이터 =======");
		System.out.println(Arrays.toString(array1));//array1 배열 출력
		Arrays.sort(array1);//array1 배열을 오름차순으로 정렬
		System.out.println("======= 정렬 후 데이터 =======");
		System.out.println(Arrays.toString(array1));//정렬된 array1 배열 요소 출력
		System.out.println("군고구마는 배열의 "+Arrays.binarySearch(array1, "군고구마")+ "번째 요소");//"군고구마"가 배열의 몇 번째 요소인지 출력
		String[] array2 = array1;//array2에 array1을 대입(같은 배열을 가리킨다)
		System.out.println("array1과 array2가 같은가? : "+Arrays.equals(array1, array2));
		String[] array3 = new String[20];//20개의 요소를 가진 문자열 배열 생성
		System.arraycopy(array2, 0, array3, 0, array2.length);//array2를 array3에 복사
		System.out.println("array3 배열: "+Arrays.toString(array3));//array3 배열을 출력, 마지막 4개의 요소는 null 값을 출력
		}
	}
