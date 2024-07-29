package basic;

import java.util.Scanner; // Scanner라는 클래스를 쓰기 위해 가져옴

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드를 통새허 입력할 수 있는 클래스 생성
		System.out.print("정수형 데이터 입력 : ");
		int a = sc.nextInt(); // 키보드로 부터 정수형 데이터를 받아라
		
		System.out.print("실수형 데이터 입력 : ");
		double b = sc.nextDouble(); // 키보드로 부터 실수형 데이터를 받아라
		
		System.out.println(a + " + " + b + " = " + (a+b));
		
//		System.out.print("문자열 데이터 입력 : ");
//		String c = sc.next(); // 키보드로 부터 문자열 데이터를 받아라
		
		
//		int scan; 정수형 변수
//		double scan; 실수형 변수
//		Scanner scan; 객체(클래스형 변수)
	}
}
