// ������ ��ȹ
// 1. iam_max(�ִ��Լ�), iam_min(�ּڰ��Լ�), sum(���������ϴ��Լ�)�� ���� �����.
	// 1) iam_max: for������ ������, ���� ���� ��� ������ ���ʷ� ���� ���� ū ���� max������ ����
	// 2) iam_min: for������ ������, ���� ���� ��� ������ ���ʷ� ���� ���� ���� ���� min������ ����
	// 3) sum: ����Ʈ? �迭? ���� �� ���� ��� sum
// 2. main Ŭ������ int n���� �ް�, ���� �Լ��� n���� �������� �����Ѵ�.
// 3. �Լ����� ����Ǵ� ������ ������ a, ���� b ���� �޴´�.
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
		System.out.print("N���� ���� �Լ��� �ҷ��ɴϴ�. ");
		System.out.println("N = ");
		int n = scan.nextInt();
		
		int[] v = new int[n];
		for(int i=0; i<n; i++) {
			v[i] = rand.nextInt(1000);

		}

	}

}
