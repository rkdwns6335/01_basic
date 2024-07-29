package study;

public class day5_5 {
	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 1};
		int answer = 0;
        String a="";
        String b="";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                a += Integer.toString(num_list[i]);
                System.out.println("a : "+ a);
            }else if(num_list[i] % 2 == 1) {
            	b += Integer.toString(num_list[i]);
            	System.out.println("b : "+ b);
            }
        }
        answer = Integer.parseInt(a) + Integer.parseInt(b);
        //System.out.println(answer);
	}
}
