package operTest20201208;

import java.util.Scanner;

public class OpTestPrac {

	public static void main(String[] args) {

		int a; // 500원 갯수
		int b; // 100원 갯수
		int c; // 50원 갯수
		int d; // 10원 갯수
		int e; // 남은 금액
		
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int m = s.nextInt();
		
		a = m / 500;
		b = (m % 500) / 100;
		c = ((m % 500) % 100) / 50;
		d = (((m % 500) % 100) % 50) / 10;
		e = (((m % 500) % 100) % 50) % 10;
		
		
		System.out.println("--------------------");
		System.out.println(" 동전 교환기 프로그램 1.0");
		System.out.println("--------------------");
		System.out.println("   500원 갯수 : " + a);
		System.out.println("   100원 갯수 : " + b);
		System.out.println("    50원 갯수 : " + c);
		System.out.println("    10원 갯수 : " + d);
		System.out.println("     나머지   : " + e);
		System.out.println("--------------------");
	}

}
