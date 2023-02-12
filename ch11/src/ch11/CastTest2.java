package ch11;
class Rectangle5{
	public int width;
	public int height;
	public Rectangle5(int w, int h) {//상위클래스 형의 객체 변수
		width = w;
		height = h;
	}
	public int computeRectangleArea() {//상위클래스 메소드
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
		Rectangle5 r = new Cube5(10,20,30);//상위 클래스 형의 객체 변수에 하위클래스 객체를 생성하여 배정
		System.out.println("정사각형의 넓이는 : "+r.computeRectangleArea());//객체 변수를 통해 상위클래스의 메소드 호출
		//System.out.println("넓이는 :"+r.computeCubeArea());// 하위클래스의 메소드 호출 불가능
		Cube5 c = (Cube5) r;//하위클래스로 형 변환을 시도하여 하위클래스 객체 변수에 배정
		System.out.println("직육면체의 부피는 :"+c.computeCubeArea());// 하위 클래스 메소드 호출가능
	}
}
