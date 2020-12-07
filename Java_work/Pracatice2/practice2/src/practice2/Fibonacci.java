package practice2;

public class Fibonacci {

	// 반복함수
	public static int fibonacci(int num) {
		int one = 1;
		int two = 1;
		int result = -1;
		if(num == 1)
		{
			return one;
		}
		else if (num == 2)
		{
			return two;
		}
		else
		{
			for (int i = 2; i < num; i++)
			{
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}
	
	// 재귀함수 : 경우에 따라 훨씬 비효율적일수 있다.
	public static int fibonacci2(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		else if(num == 2)
		{
			return 1;
		}
		else
		{
			return fibonacci2(num - 1) + fibonacci2(num -2);
		}
	}
	
	
	public static void main(String[] args) {

		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + "입니다");

		System.out.println("피보나치 수열의 50번째 원소는 " + fibonacci2(50) + "입니다");
	}

}
