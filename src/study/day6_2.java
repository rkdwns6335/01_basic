package study;

public class day6_2 {
	public static void main(String[] args) {
		int n = 0;
		String[] control = {"wsdawsdassw"};
		int answer = 0;
		for(String data  :control) {
			for(char z : data.toCharArray()) {
				if (z == 'w') n = n+1;
				else if(z == 's') n-=1;
				else if(z == 'd') n+=10;
				else if(z == 'a') n-=10;
				answer =n;
			}
		}
		System.out.println(answer);
	}

}
