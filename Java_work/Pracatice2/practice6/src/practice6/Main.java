package practice6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 학생정보 상속 (Student - Person)
		//Student student1 = new Student("황창식", 27, 178, 75, "20201207", 4, 4.5);
		//student1.show();
		
		// 학생정보 + 배열
		/*Student[] students = new Student[100];
		for(int i = 0; i < 100; i++)
		{
			students[i] = new Student("황창식", 27, 178, 75, i + "", 4, 4.5);
			students[i].show();
		}*/
		
		// 교사정보 상속 (Teacher - Person)
		/*Teacher teacher1 = new Teacher("황창식", 27, 178, 75, "20201207", 3000000, 5);
		
		teacher1.show();*/
		
		// 학생정보 + 배열 + 입력
		/*Scanner sc = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까? : ");
		int num = sc.nextInt();
		Student[] students = new Student[num];
		for(int i = 0; i < num; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("학생의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("학생의 나이를 입력하세요 : ");
			age = sc.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = sc.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = sc.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = sc.next();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = sc.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = sc.nextDouble();
			
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i = 0; i < num; i++)
		{
			students[i].show();
		}*/

	}

}
