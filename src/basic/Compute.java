package basic;

import java.lang.String; // 기본 패키지가 java.lang 이기 때문에 쓸 필요가 없다.

import java.text.DecimalFormat; // 패키지를 import 하여 가져온다.

public class Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제
		//int a = 320;
		//int b = 258;
		
		short a = 320;
		short b = 258;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		float div = (float) a /b; 
		// 그냥 a / b 를 주었을 경우 둘다 정수형이므로 값이 1.0이 나온다 
		// 하지만 (double) <- 형 변환을 하면 소수점 이하로 결과가 반환이 된다.
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul));
		// DecimalFormat 클래스에 format 함수를을 가져와서 사용하는데 mul의 3자리 값의 ,를 찍어 출력한다.
		/*
		 *  DecimalFormat이란?
		 *  곱셈연산을 포맷팅 하여 출력하는 법
		 *  
		 */
		
		System.out.println(a + " / " + b + " = " + String.format("%.2f",div));
		
		/*
		 *  new 와 new 안붙은 클래스의 차이
		 *  
		 * */
	}

}
