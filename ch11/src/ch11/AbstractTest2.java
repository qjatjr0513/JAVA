package ch11;
abstract class Figure{
	abstract void draw();
}
class Triangle2 extends Figure{
	public void draw() {
		System.out.println("������: �ﰢ���� �׸���");
	}
}
class Rectangle2 extends Figure{
	public void draw() {
		System.out.println("������: �簢���� �׸���");
	}
}
class Oval2 extends Figure{
	public void draw() {
		System.out.println("������: Ÿ������ �׸���");
	}
}
class Polydraw{//������ �׸��� ��ɸ��� ���� Ŭ���� ����
	public void pdraw(Figure f) {
		f.draw();//Figure ���� ��ü�� �޾Ƶ鿩 �� ��ü�� draw()�޼ҵ带 ȣ��
	}
	/*//�������� �������� �ʴ� ��� �� ��ü���� �޼ҵ带 �ۼ��ؾ���
	 public void pdraw(Triangle2 t){
	 	t.draw();
	 }
	 public void pdraw(Rectangle2 r){
	 	r.draw();
	 }
	 public void pdraw(Oval2 o){
	 	o.draw();
	 }
	 */
}
public class AbstractTest2 {
	public static void main(String args[]) {
		Polydraw p = new Polydraw();//������ �׸��� ���� Polydraw Ŭ�����κ��� ��ü ����
		Figure fg1 = new Triangle2();
		Figure fg2 = new Rectangle2();
		Figure fg3 = new Oval2();
		p.pdraw(fg1);
		p.pdraw(fg2);
		p.pdraw(fg3);
	}
}
