import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InversePair {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n, k, count = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size:");
		n = Integer.parseInt(bf.readLine());
		int pair[] = new int[n];
		System.out.println("Pairs: ");
		k = Integer.parseInt(bf.readLine());
		System.out.println("Enter the value for Arrays: ");
		for (int i = 0; i < n; i++) {
			pair[i] = Integer.parseInt(bf.readLine());
		}
		for (int i = 0; i < n - 1; i++) {
			if (pair[i] > pair[i + 1]) {
				count++;
			}

		}
		if(k==count)
		{
			System.out.println("Equal!!");
		}
		else{
			System.out.println("Not Equal!!");
		}

	}

}
