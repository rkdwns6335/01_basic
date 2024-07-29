package study;
 // 문자열 곱하기 문제
public class String_gob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "String";
		String answer = "";
		int k = 3;
		for(int i=0; i<k; i++){ 
            answer += my_string;
        }
        System.out.println(answer);
	}

}


//i가 k보다 작으면 answer 문자열 변수에 my_string 문자열을 넣어준다.