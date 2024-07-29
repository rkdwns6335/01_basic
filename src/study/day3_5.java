package study;

public class day3_5 {
	public static void main(String[] args) {
		int a = 91;
		int b = 2;
		int answer = 0;
		
		//String result = a +""+b;
		String result1 = String.valueOf(a) + String.valueOf(b);
		int result2 = (2*a)*b;
		System.out.println(result2);
		
		if(Integer.valueOf(result1) > result2) {
			answer += Integer.valueOf(result1);
		}else {
			answer += Integer.valueOf(result2);
		}
		System.out.println(answer);
		
		
		
	}
}
