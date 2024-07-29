package study;

import java.util.Arrays;

public class day6_5 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,3};
		int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
		int[] answer;
		
		for(int i=0; i<queries.length; i++) {
			System.out.println(queries[i]);
			for(int j = queries[i][0]; j<queries[i][1]; j++) {
				if(j % queries[i][2] == 0) arr[j]++;
			}
		}
		answer = arr;
		System.out.println(answer);
	}
}
