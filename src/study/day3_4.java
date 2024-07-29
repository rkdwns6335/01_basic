package study;

public class day3_4 {
	public static void main(String[] args) {
		int a = 9;
		int b = 19;
		int answer = 0;
		
		//String result = a +""+b;
		String result1 = String.valueOf(a) + String.valueOf(b);
		String result2 = String.valueOf(b) + String.valueOf(a);
		
		if(Integer.valueOf(result1) > Integer.valueOf(result2)) {
			answer += Integer.valueOf(result1);
		}else {
			answer += Integer.valueOf(result2);
		}
		System.out.println(answer);
		
		
		
	}
}
