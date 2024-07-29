package study;

public class zzz {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,9,0};
		int answer = -1;
		for(int i=1; i<=10; i++) {
			if(numbers[i] != i) {
				answer += i;
			}
		}
	}
}
