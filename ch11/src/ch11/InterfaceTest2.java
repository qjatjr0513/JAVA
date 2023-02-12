package ch11;
abstract class Figure1{//추상 클래스 선언
	abstract void draw();
}
interface Shape1{//인터페이스 선언
	public void computeArea(double a, double b);
}
class Triangle3 extends Figure1 implements Shape1{//추상 클래스와 인터페이스를 포함하는 클래스 작성
	void draw() {//메소드 오버라이딩
		System.out.println("삼각형을 그리는 기능");
	}
	public void computeArea(double a, double h) {//메소드 오버라이딩
		System.out.println("삼각형의 넓이: "+(a*h/2));
	}
}
class Rectangle3 extends Figure1 implements Shape1{
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}
	public void computeArea(double h, double v) {
		System.out.println("사각형의 넓이 :"+(h*v));
	}
}
class Oval3 extends Figure1 implements Shape1{
	void draw() {
		System.out.println("원을 그리는 기능");
	}
	public void computeArea(double r1, double r2) {
		System.out.println("원의 넓이 :"+(3.14*r1*r2));
	}
}
class Polydraw1{
	public void pdraw(Figure1 f) {
		f.draw();
	}
	public void pcomputeArea(Shape1 s,double a,double b ) {
		s.computeArea(a, b);
	}
}
public class InterfaceTest2 {
	public static void main(String args[]) {
		Polydraw1 p = new Polydraw1();
		Figure1 fg1 = new Triangle3();
		Figure1 fg2 = new Rectangle3();
		Figure1 fg3 = new Oval3();
		Shape1 sp1 = new Triangle3();//인터페이스 형의 객체 변수에 클래스의 객체를 배정
		Shape1 sp2 = new Rectangle3();//인터페이스 형의 객체 변수에 클래스의 객체를 배정
		Shape1 sp3 = new Oval3();//인터페이스 형의 객체 변수에 클래스의 객체를 배정
		p.pdraw(fg1);
		p.pcomputeArea(sp1, 4, 4);//인터페이스 형의 객체 변수로 메소드 호출
		p.pdraw(fg2);
		p.pcomputeArea(sp2, 4, 4);//인터페이스 형의 객체 변수로 메소드 호출
		p.pdraw(fg3);
		p.pcomputeArea(sp3, 4, 4);//인터페이스 형의 객체 변수로 메소드 호출
	}
}
