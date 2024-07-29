package study;

public class day5_4 {
	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 1};
		int answer = 0;
        int m = 1;
        int s = 0;
        for(int i=0; i<num_list.length; i++){
            m *= num_list[i];
            s += num_list[i];
            if(m < (s*s)){
                answer = 1;
            }else{
                answer = 0;
            }
        }
        //System.out.println(m);
        //System.out.println(s);
        //System.out.println(answer);
	}
}
