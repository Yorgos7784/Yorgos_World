package control;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		/*System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = s.nextInt();
		
		if(num1 >= num2) {
			do {
				System.out.println("Error!!");
				System.out.print("두번째 숫자를 다시 입력하세요 : ");
				num2 = s.nextInt();
			} while(num1 >= num2);
		}
		int sum = 0;
		for(int i = num1; i <= num2; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);*/
		
		/*System.out.print("숫자를 입력하세요 : ");
		int a = s.nextInt();
		for (int b = 1; b <= 9; b++)
		{
			System.out.println(a + " x " + b + " = " + (a*b));
		}*/
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++){
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
		
		
		
		
	}
}


