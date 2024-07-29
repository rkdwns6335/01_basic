package study;

public class day6_4 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] queries = {{0,3},{1,2},{1,4}};
		String[] answer = {};
		int e;
		
		for(int i=0; i<queries.length; i++) {
			e = arr[queries[i][0]];
			arr[queries[i][0]] = arr[queries[i][1]];
			arr[queries[i][1]] = e;
		}
		
		
	}
}
