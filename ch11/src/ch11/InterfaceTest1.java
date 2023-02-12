package ch11;
import java.util.Random;//Ŭ������ ����Ͽ� ���� ����
interface IStack{//�������̽� ����, �� ���� �޼ҵ� ����
	public void push(int item);
	public int pop();
}
class FixedStack implements IStack{//�������̽��� ������ Ŭ���� �ۼ�
	private int stack[];
	private int tos;
	FixedStack(int size){
		stack = new int[size];
		tos = -1;
	}
	public void push(int item) {//�������̽� �޼ҵ� �������̵�
		if(tos==stack.length-1)
			System.out.println("������ �� á��");
		else
			stack[++tos] = item;
	}
	public int pop() {//�������̽� �޼ҵ� �������̵�
		if(tos<0) {
			System.out.println("������ �����");
			return 0;
		}
		else
			return stack[tos--];
	}
}
public class InterfaceTest1 {
	public static void main(String args[]) {
		Random r = new Random();
		FixedStack mystack1 = new FixedStack(10);//10���� ��Ҹ� ������ ���� ���� ��ü ����
		for(int i=0;i<10;i++)
			mystack1.push(r.nextInt(10));//����(������ ��)�� �߻����� ���ÿ� ����
		System.out.println("����: mystack1");
		for(int i=0;i<10;i++)
			System.out.print(mystack1.pop()+" ");//������ ������ ���
	}
}
