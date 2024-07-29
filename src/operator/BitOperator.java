package operator;

public class BitOperator {
	public static void main(String[] args) {
		int a = 16;
		
		System.out.println("+16 = " + a);
		System.out.println("+16 = " + Integer.toBinaryString(a)); // 2를 16진수로 표현
		System.out.println();
		
		
		
		System.out.println("~16 = " + ~a);  // 1의 보수 
		System.out.println("+16 = " + Integer.toBinaryString(~a)); //
		
		
		System.out.println("-16 = " + (~a + 1));  // 2의보수
		System.out.println("+16 = " + Integer.toBinaryString(~a+1));
		
	}
}
