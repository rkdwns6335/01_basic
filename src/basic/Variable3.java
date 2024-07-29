package basic;

import java.util.Random;

public class Variable3 {
	public static void main(String[] args) {
		int big = Math.max(25, 36); // Math 클래스에 max라는 함수를 사용하여 큰 값을 출력해줌
		System.out.println("큰 값 = "+big);
		
		//12.7 , 78.5 중 작은 값 찍어주세요
		double small = Math.min(12.7, 78.5);
		System.out.println("작은 값 = "+small);
		
		//2의 5승
		double power = Math.pow(2, 5);
		System.out.println("2의 5승 = "+power);
		
		// 난수
		// 컴퓨터가 불규칙하게 발생하는 수 , 0보다 크고 1보다 작은 수
		double a = Math.random();
		System.out.println("a = "+ a);
		
		double b = new Random().nextDouble(); // java.util.Random 클래스를 가져와 nextDouble이라는 함수를 가져와서 난수를 출력함
		System.out.println("b = "+ b);
		
		// a에서 2자리만 출력하시오
		// int c = (int) a * 100; 
		int c = (int) (a * 100) ; // 위와 다르게 ( )를 넣은 이유는 순서가 민감하기 때문에 a * 100을 먼저 한 후 int형으로 형변환을 해줘라 
		System.out.println("c = "+ c);
		
		// x~y사이의 난수 발생 65 ~ 95
		int d = (int) (Math.random() * (90-65+1) + 65);
		System.out.println("d = "+d);
		
		// 대문자 영어 난수 발생
		char e = (char) (Math.random() * (90-65+1) + 65);
		System.out.println("e = "+ e);
	}
}
