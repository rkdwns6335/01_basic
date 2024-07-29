package study;
// 공배수
public class day3_7 {
	public static void main(String[] args) {
		int number = 55;
		int n = 10;
		int m = 5;
		int answer;
		
	
		if(number % n == 0 && number % m == 0) {
			answer = 1;
		}else {
			answer = 0 ;
		}
		System.out.println(answer);
	}
}
