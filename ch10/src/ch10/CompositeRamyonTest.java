package ch10;
import java.util.Scanner;
class Ramyon1{
	String ramyon = "���"; //r.ramyon  rr.rm.ramyon
	String water = "��";//r.water	rr.rm.water
	String onion = "��";//r.onion	rr.rm.onion
	void boilwater() {//r.boilwater()	rr.rm.boilwater()
		System.out.println(water+"�� ���δ�");
	}
	void cooking() {//r.cooking()	rr.rm.cooking()
		System.out.println(ramyon+"�� "+onion+"�� �ְ� ���� �丮�ϼ�. ���ְ� �弼��!!!");
	}
}
class RiceRamyon1{
	Ramyon1 rm = new Ramyon1();
	String rice = "��";
	void topping() {
		System.out.println(rice+ "�� �ִ´�");
	}
}
class CheeseRamyon1{
	Ramyon1 rm = new Ramyon1();
	String cheese = "ġ��";
	void topping() {//rr.topping()
		System.out.println(cheese+ "�� �ִ´�");
	}
}

public class CompositeRamyonTest {
	public static void main(String args[]) {
		int s;
		do {
			System.out.print("����� ���� �丮�� �Է��ϼ���(1:�Ϲݶ��, 2:����� 3:ġ����, 99:����) : ");
			Scanner stdin = new Scanner(System.in);
			s = stdin.nextInt();
			if(s==1) {
				Ramyon1 r = new Ramyon1();
				r.boilwater();
				r.cooking();
			}else if(s==2) {
				RiceRamyon1 rr = new RiceRamyon1();
				rr.rm.boilwater();
				rr.topping();
				rr.rm.cooking();
			}else if(s==3) {
				CheeseRamyon1 cr = new CheeseRamyon1();
				cr.rm.boilwater();
				cr.topping();
				cr.rm.cooking();
			}
		}while(s!=99);//99�� ����
		System.out.print("�����մϴ�");
	}
}
