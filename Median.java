import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Median {
	public static void main(String[] args) throws IOException {
		int m, n,mid;
		float median=0.0f;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sizes for num1 and num2 array: ");
		String s1 = bf.readLine();
		m = Integer.parseInt(s1);
		String s2 = bf.readLine();
		n = Integer.parseInt(s2);
	//	System.out.println(m+" "+n);
		int num1[] = new int[m];
		int num2[] = new int[n];
		System.out.println("Enter the values for array1:");
		for (int i = 0; i < m; i++) {
			String s = bf.readLine();
			int x = Integer.parseInt(s);
			num1[i] = x;
		}
		System.out.println("Enter the values for array2:");
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			int x = Integer.parseInt(s);
			num2[i] = x;
		}
		//System.out.println(m+n);
		int sort[] = new int[m + n];
		for (int i = 0; i < m; i++) {
			sort[i] = num1[i];
		}
		int k=0;
		for (int i = m; i < m+n; i++) {
			sort[i] = num2[k];
			k++;
		}
		//System.out.println(sort.length);
		Arrays.sort(sort);
		for (int i = 0; i <sort.length; i++) {
			System.out.println(sort[i] + " ");
		}
		
		mid = (sort.length)/2;
		if(sort.length%(2)==0){
			median = (Float.valueOf(Float.valueOf(sort[mid]))+(Float.valueOf(sort[mid-1])))/(2);
		}
		else if(sort.length%(2)==1){
			median = Float.valueOf(sort[mid]);
		}
		System.out.println(median);
	}

}
