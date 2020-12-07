package practice2;

public class Factorial {

	// 반복함수
	public static int factorial(int num)
	{
		int sum = 1;
		for(int i = 2; i <= num; i++)
		{
			sum *= i;
		}
		return sum;
	}
	
	// 재귀함수
	public static int factorial2(int num)
	{
		if (num == 1)
			return 1;
		else
			return num * factorial2(num - 1);
	}
	
	public static void main(String[] args) {

		System.out.println("10팩토리얼은 " + factorial(10)); // 반복함수

		System.out.println("10팩토리얼은 " + factorial2(10)); // 재귀함수
	}

}
