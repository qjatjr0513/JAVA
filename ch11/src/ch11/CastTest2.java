package ch11;
class Rectangle5{
	public int width;
	public int height;
	public Rectangle5(int w, int h) {//����Ŭ���� ���� ��ü ����
		width = w;
		height = h;
	}
	public int computeRectangleArea() {//����Ŭ���� �޼ҵ�
		return width * height;
	}
}
class Cube5 extends Rectangle5{
	public int depth;
	public Cube5(int w, int h, int d) {
		super(w,h);
		depth = d;
	}
	public int computeCubeArea() {
		return super.computeRectangleArea() * depth;
	}
}
public class CastTest2 {
	public static void main(String args[]) {
		Rectangle5 r = new Cube5(10,20,30);//���� Ŭ���� ���� ��ü ������ ����Ŭ���� ��ü�� �����Ͽ� ����
		System.out.println("���簢���� ���̴� : "+r.computeRectangleArea());//��ü ������ ���� ����Ŭ������ �޼ҵ� ȣ��
		//System.out.println("���̴� :"+r.computeCubeArea());// ����Ŭ������ �޼ҵ� ȣ�� �Ұ���
		Cube5 c = (Cube5) r;//����Ŭ������ �� ��ȯ�� �õ��Ͽ� ����Ŭ���� ��ü ������ ����
		System.out.println("������ü�� ���Ǵ� :"+c.computeCubeArea());// ���� Ŭ���� �޼ҵ� ȣ�Ⱑ��
	}
}
