package ch10;
class D1{
	public int x = 1000;
	public void display() {
		System.out.println("���� Ŭ������ D1�� display() �޼ҵ� �Դϴ�");
	}
}
class D2 extends D1{
	public int x = 2000;
	public void display() {
		System.out.println("���� Ŭ���� D2�� display() �޼ҵ� �Դϴ�.");
	}
	public void write() {
		display();
		super.display();
		System.out.println("D2 Ŭ���� ��ü�� x ���� : "+x);
		System.out.println("D1 Ŭ���� ��ü�� x ���� : "+super.x);
	}
}
public class SuperTest2 {
	public static void main(String args[]) {
		D2 d = new D2();
		d.write();
	}
}
