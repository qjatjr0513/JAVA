package ch06;
import java.util.Arrays;
public class ArraysCMethodTest2 {
	public static void main(String args[]) {
		String[] array1 = {"IMF","���ֵ�","�ڹٵ���","�ѱ۳���","Computer","��ī","JAVA","���ͳ�Ž��","�ʷ��ʷ�","come","�ٶ�","��ũ����","������","����","their","country"};//16���� ���ڿ� ��Ҹ� ���� �迭 ����
		System.out.println("======= ���� �� ������ =======");
		System.out.println(Arrays.toString(array1));//array1 �迭 ���
		Arrays.sort(array1);//array1 �迭�� ������������ ����
		System.out.println("======= ���� �� ������ =======");
		System.out.println(Arrays.toString(array1));//���ĵ� array1 �迭 ��� ���
		System.out.println("�������� �迭�� "+Arrays.binarySearch(array1, "������")+ "��° ���");//"������"�� �迭�� �� ��° ������� ���
		String[] array2 = array1;//array2�� array1�� ����(���� �迭�� ����Ų��)
		System.out.println("array1�� array2�� ������? : "+Arrays.equals(array1, array2));
		String[] array3 = new String[20];//20���� ��Ҹ� ���� ���ڿ� �迭 ����
		System.arraycopy(array2, 0, array3, 0, array2.length);//array2�� array3�� ����
		System.out.println("array3 �迭: "+Arrays.toString(array3));//array3 �迭�� ���, ������ 4���� ��Ҵ� null ���� ���
		}
	}
