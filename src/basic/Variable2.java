package basic;

public class Variable2 {
	int a; // 클래스 변수 (전역변수) or 필드 , 이미 초기화가 되어있음
	// static을 안 붙이고 메인함수에서 쓸려면 인스턴스를 생성해줘야 사용이 가능하다.

	static int b; 
	// 필드, 초기화가 되어있음 , 
	//static을 붙으면 이미 int b라는 변수가 지정이 되어있다.
	
	static String c; 
	// 클래스 타입의 초기값은 null로 되어있다 (int = 0 , String = null)
	// 함수 밖에서는 변수 선언만 할 수 있고 명령어들은 함수 안에 넣어줘야 한다.

	
	public static void main(String[] args) {
		int a=100; //local variable(지역변수) , 쓰레기값(초기화 무조건 시키기)
		System.out.println(a);
		
		//int a; error 뜨는 이유 : a라는 변수가 중복이 되어서 에러가 뜸
		System.out.println("main 함수의 변수 a = "+a);
		System.out.println("클래스 변수 a = " +new Variable2().a); // 클래스 변수를 인스턴스 하여 클래스 a의 값 출력
		System.out.println("클래스 변수 b = "+b); //static이 붙으므로 인스턴스를 생성 안해도 변수 이름으로 출력
		
		c = "apple"; //리터럴 생성
		System.out.println("c = "+ c);
		//String 클래스만 객체를 생성 안해도 값을 넣어줄 수 있다
	}
}
