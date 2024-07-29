package study;

public class day3_10 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 3;
		int res = 0;
		
		int answer = 0;
        if (a == b || a == c || b == c ) {
        	res = (a+b+c)*((a*a)+(b*b)+(c*c));
        }else if(a != b || a != c || b != c) {
        	res = (a+b+c);
        }else {
        	//res = (a+b+c) * ((a*a)+(b*b)+(c*c) * ((a*a*a)+(b*b*b)+(c*c*c);
        }
        
        System.out.println(res);
	}
}
