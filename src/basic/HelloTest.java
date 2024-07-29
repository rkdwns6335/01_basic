package basic;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		System.out.println();
		
		//※컴퓨터는 무조건 숫자로 알려줌
		System.out.println('A' + 32); //A == 65 이기 때문에 65+32 = 97으로 출력이 된다.
		System.out.println((char)('A' + 32)); //문자로 보고 싶으면 char()함수를 쓰면 된다. == 강제 형변환
		System.out.println((char)(97));
		System.out.println("");
		
		System.out.println(2+3);
		System.out.println('2' + '3');
		
		//결과가 5가 나오도록 하기 
		System.out.println('2'- 48 + '3'-48); // 2 = 50 , 3 = 51 이므로 -48씩 하고 값을 더하면 5가 나온다
		
		System.out.println("2" + "3"); // 23
		
		//정수형 parseInt 활용법
		System.out.println(Integer.parseInt("2") + Integer.parseInt("3")); // 5
		
		//실수형 parseDouble 활용법
		System.out.println(Double.parseDouble("12.5") + Double.parseDouble("36.8")); // 49.3
	}

}
