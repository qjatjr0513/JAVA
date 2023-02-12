package ch11;
class Rectangle4{
	public int width;
	public int height;
	public Rectangle4(int w, int h) {
		width = w;
		height = h;
	}
	public int computeRectangleArea() {
		return width * height;
	}
}
class Cube4 extends Rectangle4{
	public int depth;
	public Cube4(int w, int h, int d) {
		super(w,h);
		depth = d;
	}
	public int computeCubeArea() {
		return super.computeRectangleArea() * depth;
	}
}
public class CastTest1 {
	public static void main(String args[]) {
		Rectangle4 r = new Cube4(10,20,30);//상위클래스 형의 객체 변수에 하위 클래스의 객체를 생성하여 배정
		System.out.println("넓이는 :"+r.computeRectangleArea());//객체변수(r)를 통해 상위 클래스의 메소드 호출
		//System.out.println("넓이는 : "+r.computeCubeArea());//하위클래스의 메소드 호출 불가능
		//Cube4 c = new Retangle4(10,20);//하위 클래스의 객체 변수에 상위 클래스의 메소드 배정 불가능
	}
}
