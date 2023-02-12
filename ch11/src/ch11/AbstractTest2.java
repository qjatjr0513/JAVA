package ch11;
abstract class Figure{
	abstract void draw();
}
class Triangle2 extends Figure{
	public void draw() {
		System.out.println("다형성: 삼각형을 그린다");
	}
}
class Rectangle2 extends Figure{
	public void draw() {
		System.out.println("다형성: 사각형을 그린다");
	}
}
class Oval2 extends Figure{
	public void draw() {
		System.out.println("다형성: 타원형을 그린다");
	}
}
class Polydraw{//도형을 그리는 기능만을 위한 클래스 생성
	public void pdraw(Figure f) {
		f.draw();//Figure 형의 객체를 받아들여 그 객체의 draw()메소드를 호출
	}
	/*//다형성을 제공하지 않는 경우 각 객체별로 메소드를 작성해야함
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
		Polydraw p = new Polydraw();//도형을 그리기 위해 Polydraw 클래스로부터 객체 생성
		Figure fg1 = new Triangle2();
		Figure fg2 = new Rectangle2();
		Figure fg3 = new Oval2();
		p.pdraw(fg1);
		p.pdraw(fg2);
		p.pdraw(fg3);
	}
}
