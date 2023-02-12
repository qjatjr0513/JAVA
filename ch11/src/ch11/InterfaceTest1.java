package ch11;
import java.util.Random;//클래스를 사용하여 난수 생성
interface IStack{//인터페이스 선언, 두 개의 메소드 선언
	public void push(int item);
	public int pop();
}
class FixedStack implements IStack{//인터페이스를 포함한 클래스 작성
	private int stack[];
	private int tos;
	FixedStack(int size){
		stack = new int[size];
		tos = -1;
	}
	public void push(int item) {//인터페이스 메소드 오버라이딩
		if(tos==stack.length-1)
			System.out.println("스택이 꽉 찼음");
		else
			stack[++tos] = item;
	}
	public int pop() {//인터페이스 메소드 오버라이딩
		if(tos<0) {
			System.out.println("스택이 비었음");
			return 0;
		}
		else
			return stack[tos--];
	}
}
public class InterfaceTest1 {
	public static void main(String args[]) {
		Random r = new Random();
		FixedStack mystack1 = new FixedStack(10);//10개의 요소를 가지는 정수 스택 객체 생성
		for(int i=0;i<10;i++)
			mystack1.push(r.nextInt(10));//난수(무작위 수)를 발생시켜 스택에 저장
		System.out.println("스택: mystack1");
		for(int i=0;i<10;i++)
			System.out.print(mystack1.pop()+" ");//스택의 내용을 출력
	}
}
