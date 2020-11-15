// 민지의 계획
// 1. iam_max(최댓값함수), iam_min(최솟값함수), sum(총합을구하는함수)를 각각 만든다.
	// 1) iam_max: for루프를 돌려서, 구간 안의 모든 값들을 차례로 비교해 제일 큰 수를 max값으로 설정
	// 2) iam_min: for루프를 돌려서, 구간 안의 모든 값들을 차례로 비교해 제일 작은 수를 min값으로 설정
	// 3) sum: 리스트? 배열? 구간 속 값을 모두 sum
// 2. main 클래스에 int n값을 받고, 랜덤 함수로 n개의 랜덤값을 생성한다.
// 3. 함수들이 적용되는 구간의 시작점 a, 끝점 b 값을 받는다.
// 4. System.out.print(iam_max + " , " + iam_min + " , " + sum) 

import java.util.Random;
import java.util.Scanner;

public class Project1 {
	
	public static void iam_max(int[] v, int n) {
		for(int i = 0; i < n-1; i++) {
			int max = i;
			for(int j = i+1; j<n; j++) {
				if(v[j] > v[max]) max = j;				
			}
			int t = v[i];
			v[i] = v[max];
			v[max] = t;
		}
		
	}
	
	public static void iam_min(int[] v, int n) {
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(v[j] < v[min]) min = j;
			}
			int t = v[i];
			v[i] = v[min];
			v[min] = t;
		}
	}
	
	public static void sum(int[] v, int a, int b) {
		for(int i = a; i <= b; i++)
			v[i]++;
	}
 	
	
	public static void main(String[] args) {
		Random rand = new Random(100);
		Scanner scan = new Scanner(System.in);
		System.out.print("N개의 랜덤 함수를 불러옵니다. ");
		System.out.println("N = ");
		int n = scan.nextInt();
		
		int[] v = new int[n];
		for(int i=0; i<n; i++) {
			v[i] = rand.nextInt(1000);

		}

	}

}
