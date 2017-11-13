import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShallowCopy {

	public static void main(String[] args) throws IOException {
		String copyfrom[] = new String[5];
		String copyto[] = copyfrom;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Values for Array: ");
		for (int i = 0; i < copyfrom.length; i++) {
			copyfrom[i] = bf.readLine();
		}
		copyfrom[1] = null;
		System.out.println("ORIGINAL ARRAY");
		for (String s : copyfrom) {
			System.out.println(s + " ");
		}
		System.out.println("COPIED ARRAY: ");
		for (String s : copyto) {
			System.out.println(s + " ");
		}
	}

}
