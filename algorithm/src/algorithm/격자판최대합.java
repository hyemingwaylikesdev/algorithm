package algorithm;

import java.util.Scanner;

public class 격자판최대합 {
	public int solution(int n, int[][] items) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		for (int i = 0; i < n; i++) {
			sum1 = sum2= 0;

			for (int j = 0; j < n; j++) {
				sum1 += items[i][j]; // 행고정
				sum2 += items[j][i]; // 열고정
			}
			answer = Math.max(answer,sum1);
			answer = Math.max(answer,sum2);
		}
		sum1 = sum2= 0;
		
		//대각선 
		for (int i = 0; i < n; i++) {
			sum1 += items[i][i];
			sum2 += items[i][n-i-1];

		}
		answer = Math.max(answer,sum1);
		answer = Math.max(answer,sum2);

		return answer;
	}

	public static void main(String args[]) {
		격자판최대합 T = new 격자판최대합();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] items = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				items[i][j] = sc.nextInt();
			}

		}

		System.out.print(T.solution(n, items));

	}

}
