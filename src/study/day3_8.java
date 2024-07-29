package study;

public class day3_8 {
	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		
		if(n%2 == 1){
            for(int i=1;i<=n;i+=2){
                answer += i;
            }
        }
        else{
            for(int i=2;i<=n;i+=2){
                answer += i*i;
            }
        }
		System.out.println(answer);
	}
}