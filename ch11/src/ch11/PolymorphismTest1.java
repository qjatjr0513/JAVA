package ch11;
class Am{
	int count=1;
	void callme() {
		System.out.println("Am�� callme() ����, count �� :"+count);
	}
}
class Bm extends Am{
	int count=2;
	void callme() {
		System.out.println("Bm�� callme() ����, count �� :"+count);
	}
}
class Cm extends Am{
	int count=3;
	void callme() {
		System.out.println("Cm�� callme() ����, count �� :"+count);
	}
}
public class PolymorphismTest1 {
	public static void main(String args[]) {
		Am r = new Am();
		r.callme();
		System.out.println("r.count �� :"+r.count);
		
		r=new Bm();//Am Ŭ���� ���� ��ü���� r�� Bm Ŭ������ ��ü ����(�� ��ȯ)
		r.callme();
		System.out.println("r.count �� :"+r.count);//Am Ŭ������ count �� 1�� ���(�������̵��� ������� �ʰ�, Am Ŭ������ 1�� ���)
		
		r=new Cm();//Am Ŭ���� ���� ��ü���� r�� Cm Ŭ������ ��ü ����(�� ��ȯ)
		r.callme();
		System.out.println("r.count �� :"+r.count);//Am Ŭ������ count �� 1�� ���(�������̵��� ������� �ʰ�, Am Ŭ������ 1�� ���)
	}
}
