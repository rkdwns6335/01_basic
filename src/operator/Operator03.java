package operator;

public class Operator03 {
	public static void main(String[] args) {
		int a = 5;
		a += 2; // a = a + 2
		a *= 3; // a = a * 3
		System.out.println(a); // a = 21
		
		a++; // a라는 변수에 1 증감해라
		System.out.println(a); // a = 22
		
		int b = a++; 
		// 나중에 증감연산을 한다.
		// 1. int b = a;
		// 2. a++;
		System.out.println(a); // a = 23
		System.out.println(b); // b = 22
		
		int c = ++a - b--; // a(24) - b(22) = 2
		// 처음으로 a는 선행이므로 "24" 이고 b는 후행이기때문에 "22"이므로 답은 "2"다
		// 1. ++a = 24
		// 2. a(24) - b(22) = 2
		// 3. b-- = 21
		
		System.out.println("a++ = "+a++); // a = 24
		System.out.println("a = " + a); // a = 25

	}
}
