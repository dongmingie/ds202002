// ���� ������ �̿��� ������׷����� ���� ū ������ ���簢�� ���� ���ϱ�
// �Է�: ������׷��� ���� ���� N, ���õ��� ���� N�� �Է�
// �̿� ���� �亯, ���簢���� ���̸� ����ϸ� �˴ϴ�

import java.util.Scanner;

public class Main {

	// ���������� ���� �Լ�
	// �迭 v���� ���� (a,b) �������� �ִ� ũ���� ���簢�� ���� ��ȯ	
	
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
	
	// ������׷����� �ִ� ���簢�� ���̸� ����� ����ϴ� �Լ�
	// v: ������׷��� ���õ��� �������� �迭
	// n: ������ ����
	
	static int histo(int[] v, int n) {
		// v[0, n-1] ������ ���̸� ���ؼ� �� ���� ��ȯ�Ѵ�.
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
