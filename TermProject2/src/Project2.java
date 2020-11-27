import java.util.Random;
import java.util.Scanner;

public class Project2 {
	
	public static void iam_max(int[] v, int a, int b) {
		for(int i = a; i <= b; i++) {
			int max = i;
			for(int j = i+1; j <= b; j++) {
				if(v[j] > v[max]) max = j;				
			}
			int t = v[i];
			v[i] = v[max];
			v[max] = t;
		}
		
	}
	
	public static void iam_min(int[] v, int a, int b) {
		for(int i = 0; i < b-1; i++) {
			int min = i;
			for(int j=i+1; j<b; j++) {
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
		for(int i=0; i<=n; i++) {
			v[i] = rand.nextInt(1000);
		}
		
		//여기서부터 시간 측정 시작
		long t = System.currentTimeMillis();
		
		// k개의 인풋값(구간)의 개수를 받습니다.
		System.out.println("입력하실 input값의 개수를 설정해 주세요: ");
		int k = scan.nextInt();
		
		// k번 for 반복문을 돌립니다.
		for(int i = 1; i <= k; i++) {
							
			System.out.println("min, max, sum 값을 구할 구간을 설정해 주세요: ");
			//while문을 돌려서 input값에 하자가 있으면 에러 처리, 재입력시킵니다.
			while (true) {
				int a = scan.nextInt(); int b = scan.nextInt();
				
				if(a>b || a>n || a<1 || b<1 || b>n) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
					continue;			
					}
						
				else {								
					break;
				}
			
			System.out.println(iam_max(v,a,b)+ "," +iam_min(v,a,b) + "," + sum(v,a,b));	
				
			}
		
		}
		
		long f = System.currentTimeMillis();
		System.out.println("The elapsed time is" + (t-f) + "ms.");
	}

}
