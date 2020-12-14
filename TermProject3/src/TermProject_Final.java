import java.util.Random;
import java.util.Scanner;

public class TermProject_Final {
	
	
	// max
	public static void iam_max(int[] v, int a, int b) {
		for(int i = a; i <= b-1; i++) {
			int max = v[i];
			for(int j = i+1; j <= b; j++) {
				if(v[j] > v[max]) max = v[j];				
			}
		System.out.print(max);
		}
		
	}
	
	// min
	public static void iam_min(int[] v, int a, int b) {
		for(int i = 0; i < b-1; i++) {
			int min = v[i];
			for(int j = i+1; j <= b; j++) {
				if(v[j] < v[min]) min = v[j];
			}
		System.out.print(min);
		}
	}
	
	// sum
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
		for(int i=1; i<=n; i++) {
			v[i] = rand.nextInt(n);
		}
		
		//���⼭���� �ð� ���� ����
		long t = System.currentTimeMillis();
		
		// k���� ��ǲ��(����)�� ������ �޽��ϴ�.
		System.out.println("�Է��Ͻ� ���� k���� ������ ������ �ּ���: ");
		int k = scan.nextInt();		
		
		// k�� for �ݺ����� �����ϴ�.
		for(int i = 1; i <= k; i++) {
			System.out.println(i+"��° ������ �Է��� �ּ���: ");				
			
			while(true) {
			int a = scan.nextInt(); int b = scan.nextInt();
				
			if(a>b || a>n || a<1 || b<1 || b>n) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			
				else {
					break;
				}
								
			System.out.println(iam_max(v,a,b));
			System.out.print(iam_min(v,a,b));
			System.out.print(sum(v,a,b));
			
			// ���� ..
		}
				
		long f = System.currentTimeMillis();
		System.out.println("The elapsed time is" + (t-f) + "ms.");
	}

	}
}