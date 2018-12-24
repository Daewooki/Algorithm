import java.util.Scanner;
public class Main{
	static int ia[];
	static int ib[];
	static int ic[];
	static int dataSize;
	static int iaMaxNum;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		dataSize = sc.nextInt();
		ia = new int[dataSize];
		ic = new int[dataSize];
		
		for (int i = 0; i < dataSize; i++) {
			ia[i] = sc.nextInt();
		}
		iaMaxNum = ia[0];
		for (int i = 1; i < ia.length; i++) {
			if (iaMaxNum < ia[i]) {
				iaMaxNum = ia[i];
			}
		}
		
		ib = new int[iaMaxNum + 1];

		for (int i = 0; i < ib.length; i++) {
			ib[i] = 0;
		}
		for (int i = 0; i < ia.length; i++) {
			ib[ia[i]] = ib[ia[i]] + 1;
		}
		for (int i = 0; i < ib.length - 1; i++) {
			ib[i + 1] = ib[i] + ib[i + 1];
		}
		for (int i = 0; i < ic.length; i++) {
			ic[ib[ia[i]] - 1] = ia[i];
                        ib[ia[i]] -= 1;
		}
		for (int i = 0; i < ic.length; i++) {
			System.out.print(ic[i] + " ");
		}
	}
}
