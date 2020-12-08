// 분할 정복을 이용해 히스토그램에서 가장 큰 넓이의 직사각형 넓이 구하기
// 입력: 히스토그램의 샘플 갯수 N, 샘플들의 도수 N개 입력
// 이에 대한 답변, 직사각형의 넓이를 출력하면 됩니다

import java.util.Scanner;

public class Main {

	// 분할정복을 위한 함수
	// 배열 v에서 범위 (a,b) 구간에서 최대 크기의 직사각형 넓이 반환	
	
	static int histo(int[] v, int a, int b) {
		if(a==b) return v[a];

		int mid = (a+b)/2, r=2;
		int lo = mid, hi = mid+1;
		long min = (v[mid]<v[mid+1])?v[mid]:v[mid+1];
		long max = min*r;
		int i = mid-1, j = mid+2;
		
		while(i>=a && j<=b) {
			if(v[i]>v[j]) {
				if(v[i] < min) 
					min=v[i]; 
					i--;
			}
			else {if(v[j]<min) 
				min=v[j]; 
				j++;
			}
			if(max<min*(++r)) max = min*r;
		}
		
		long left = histo(v, a, mid);
		long right = histo(v, mid+1, b);
		if(max < left) max = left;
		if(max < right) max = right;
		return max;
	}
	
	// 히스토그램에서 최대 직사각형 넓이를 계산해 출력하는 함수
	// v: 히스토그램의 샘플들의 도수들의 배열
	// n: 샘플의 개수
	
	static int histo(int[] v, int n) {
		// v[0, n-1] 구간의 넓이를 구해서 그 값을 반환한다.
		return histo(v, 0, n-1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] v = new int[n];
		
		for(int i = 0; i < n; i++) {
			v[i] = scan.nextInt();
			
		}
		
		int r = histo(v, n);
		System.out.println(r);

	}

}
