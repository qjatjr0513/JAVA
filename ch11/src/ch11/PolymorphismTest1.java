package ch11;
class Am{
	int count=1;
	void callme() {
		System.out.println("Am의 callme() 실행, count 값 :"+count);
	}
}
class Bm extends Am{
	int count=2;
	void callme() {
		System.out.println("Bm의 callme() 실행, count 값 :"+count);
	}
}
class Cm extends Am{
	int count=3;
	void callme() {
		System.out.println("Cm의 callme() 실행, count 값 :"+count);
	}
}
public class PolymorphismTest1 {
	public static void main(String args[]) {
		Am r = new Am();
		r.callme();
		System.out.println("r.count 값 :"+r.count);
		
		r=new Bm();//Am 클래스 형의 객체변수 r에 Bm 클래스의 객체 배정(형 변환)
		r.callme();
		System.out.println("r.count 값 :"+r.count);//Am 클래스의 count 값 1이 출력(오버라이딩이 적용되지 않고, Am 클래스의 1이 출력)
		
		r=new Cm();//Am 클래스 형의 객체변수 r에 Cm 클래스의 객체 배정(형 변환)
		r.callme();
		System.out.println("r.count 값 :"+r.count);//Am 클래스의 count 값 1이 출력(오버라이딩이 적용되지 않고, Am 클래스의 1이 출력)
	}
}
