package study;

public class day7_3 {
	public static void main(String[] args) {
		int start_num = 3;
		int end_num = 10;
		int[] answer = new int[end_num - start_num +1];

		for (int i = 0; i < answer.length; i++) {
		    answer[i] = start_num + i; // start_num에 i를 더하여 값을 계산
		}
		
		for(int data : answer) {
			System.out.println(data);
		}
		
	}
}
