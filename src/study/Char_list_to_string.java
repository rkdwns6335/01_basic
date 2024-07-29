package study;

public class Char_list_to_string {
	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
		String answer = "";
		for(int i = 0; i<arr.length; i++){
            answer += answer.charAt(i);
        }
		System.out.println(answer);
	}
}
