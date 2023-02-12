package ch03;

public class BitOPTest1 {
	public static void main(String args[])
	{
		int a = 13;
		int b = 12;
		System.out.println(" a = " +a+ "("+Integer.toBinaryString(a)+")");//1110
		System.out.println(" b = " +b+ "("+Integer.toBinaryString(b)+")");//1011
		System.out.println(" a&b = " +(a&b)+ "("+Integer.toBinaryString(a&b)+")");//1010
		System.out.println(" a|b = " +(a|b)+ "("+Integer.toBinaryString(a|b)+")");//1111
		System.out.println(" a^b = " +(a^b)+ "("+Integer.toBinaryString(a^b)+")");//0101 = 101 
		System.out.println(" ~b = " +(~b)+ "("+Integer.toBinaryString(~b)+")");// 1011 00...000100 11.111011 앞의 1은 부호(-) 크기는  11....111011+1 11...111100 1100(12)
	}
}
