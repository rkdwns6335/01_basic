package operator;

public class Operator04 {
	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result = ( (num1+=10) < 0 && (num2+=10) > 0 );
		// 1. ( ) 우선순위에 있기 때문에 먼저 num1에 10 더한 후 논리연산자를 수행한다
		// 2. && 연산자는 왼쪽 피연산자가 거짓이므로 오른쪽 피연산자는 수행하지 않는다
		
		System.out.println("result : "+ result);
		System.out.println("num1 = " + num1 + " num2 : " + num2); //num1 = 10 , num2 = 0
		
		result = ( (num1+=10) > 0 || (num2+=10) > 0 );
		// 1. ( ) 우선순위에 있기 때문에 num1에 10 더한 후 논리연산자를 수행한다
		// 2. || 연산자는 왼쪽 피연산자가 참이므로 오른쪽 피연ㅅ나자는 수행하지 않는다
		System.out.println("result : "+ result);
		System.out.println("num1 = " + num1 + " num2 : " + num2); //num1 = 20 , num2 = 0
	
	}
}
