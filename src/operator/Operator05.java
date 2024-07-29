package operator;

public class Operator05 {
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = "+ a);
		System.out.println("!a = " + !a);
		
		String b = "apple";
		String c = "apple";
		// 위에는 "apple" 이라는 주소를 물어보는 것
		
		String d = new String("apple");
		// 위에는 new를 객체를 생성하고 이를 통해서 다른 주소값을 할당받아서 b,c와 주소값이 다르다
		
		System.out.println("b == c : " + (b == c? "같다":"다르다")); //주소 비교
		System.out.println("b == d : " + (b == d? "같다":"다르다")); //주소 비교
		System.out.println();
		
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다":"다르다")); // equals() 는 문자열 비교하는것
		System.out.println("b.equals(d) : " + (b.equals(d) ? "같다":"다르다")); // equals() 는 문자열 비교하는것
		
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "같다":"다르다")); // equals() 는 문자열 비교하는것
		System.out.println("!b.equals(d) : " + (!b.equals(d) ? "같다":"다르다")); // equals() 는 문자열 비교하는것
		
		
	}
}
