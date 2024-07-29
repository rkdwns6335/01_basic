package basic;

public class Variable {
	public static void main(String[] args) {
		// Boolean 예제
		System.out.println(25 < 36); // 25가 36보다 작으므로 True 값을 반환 = 1
		System.out.println(25 > 36); // 25가 36보다 크지 않으므로 False 값을 반환 = 0
		
		// Boolean 변수 예제
		boolean a = 25 > 36; 
		System.out.println(a); // 1 Byte가 잡힘 
		
		// Char 변수 예제
		char b = 'A';
		System.out.println(b); // = A
		char c = 65;
		System.out.println(c); // 기계는 숫자를 문자로 취급을 해주므로 문자 'A' 를 반환함 = A
		
		// Byte 변수 예제
		//byte d = 300; // -128 ~ +127 이므로 300은 에러가 난다
		
		//Int 변수 예제
		int e = 65;
		System.out.println(e);
		int f = 'A'; 
		System.out.println(f); // 'A' 는 65이므로 값이 65로 반환이 된다.
		
		//Long 변수 예제
		long g = 25L;  //long 형을 사용하므로 L or l 을 접두어로 붙혀 사용한다.
		System.out.println(g);
		
		//Float 변수 예제
		// 첫번째 사용법
		float h1 = 43.8f; //long 과 마찬가지로 f or F 을 접두어로 붙혀 사용한다.
		System.out.println(h1);
		// 두번째 사용법
		float h2 = (float)43.8; //Casting 을 하여 float 형태로 만듬
		System.out.println(h2);
		
	}
}


