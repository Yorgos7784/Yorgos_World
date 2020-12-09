package control;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
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
		
		
		
		
		/*System.out.println("--------------------------");
		System.out.println("     구구단 프로그램 v1.0");
		System.out.println("--------------------------");
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++){
				
				System.out.print(i + " x " + j + " = " + (i*j) + "   ");
			}
			System.out.println();
		}*/
		
		
		
		
		
		/*while(true) {
			System.out.println("-----------------------");
			System.out.println("간단 파일 관리 프로그램 v1.0");
			System.out.println("-----------------------");
			System.out.println("1. 파일 생성 및 쓰기");
			System.out.println("2. 파일 읽기");
			System.out.println("3. 종료");
			System.out.println("-----------------------");
			System.out.print("메뉴를 선택하세요 : ");
			int num1 = s.nextInt();
			if(num1 == 1) {
				BufferedOutputStream bs;
				try {
					bs = new BufferedOutputStream(
							new FileOutputStream(
									"d:/test1,txt"));
					String str = "파일 생성 및 쓰기 예제입니다.";
					bs.write(str.getBytes());
					bs.close();
				}
				catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			else if(num1 == 2){
				BufferedReader br;
				try {
					br = new BufferedReader(
							new FileReader(new File("d:/test1.txt")));
					String str = br.readLine();
					System.out.println("---파일 내용 읽어오기---");
					System.out.println(str);
					br.close();
				}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			else if(num1 == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		
		}*/
		
		
		
		
		/*int arr[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		int sum = 0;
		for(int i = 0; i < 10; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (sum / 10));*/
		
		
		
		
		
		
		
	}
}


