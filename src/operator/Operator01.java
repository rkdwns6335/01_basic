package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현금 입력 : ");
		pay = sc.nextInt();
		
		int chun = pay / 1000;
		//System.out.println(chun);
		int baek = (pay % 1000) / 100;
		//System.out.println(baek);
		int sip = (pay % 100) / 10;
		//System.out.println(sip);
		int il = (pay % 10);
		//System.out.println(il);

		System.out.println("천원 : "+chun+"개");
		System.out.println("백원 : "+baek+"개");
		System.out.println("십원 : "+sip+"개");
		System.out.println("일원 : "+il+"개");
		
	}

}

/*
[문제] 동전 교환
현금을 입력하여 천, 백, 십, 일의 개수를 구하시오
-Scanner 사용
-연산자 /와 % 사용
[실행결과]
현금 입력 : 5723
천원 : 5장
백원 : 7개
십원 : 2개
일원 : 3개
 * */
 