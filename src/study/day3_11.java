package study;

public class day3_11 {
	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 1}; 
		int m = 1;
        double s = 0;
        for(int i=0;i<num_list.length;i++){
            m *= num_list[i];
            s = Math.pow(num_list[i],num_list[i]);
            System.out.println(s);
            //System.out.println(m);
            System.out.println(m);
        }
	}
}
