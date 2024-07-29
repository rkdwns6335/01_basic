package study;

public class day3_9 {
	public static void main(String[] args) {
		boolean[] included = {true, false, false, true, true};
		int d = 4;
		int a = 3;
		int answer = 0;
		
		for(int i=0; i<included.length; i++){
            if(included[i] == true){
                answer += a+(d*i);
                System.out.println(answer);
            }
        }
		System.out.println(answer);
	}
}
