
public class StringBuffBuilderEx {

	public static void main(String[] args) {

		String s = "JAVA";
		long starTime = System.currentTimeMillis();
		for (int i = 0; i <= 1000; i++) {
			s = s + "J2EE";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken by String:" + (endTime - starTime) + "ms");
		StringBuffer sbf = new StringBuffer("JAVA");
		starTime = System.currentTimeMillis();
		for (int i = 0; i <= 1000; i++) {
			sbf.append("J2EE");
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time Taken by StringBuffer:" + (endTime - starTime) + "ms");
		StringBuilder sb = new StringBuilder("JAVA");
		starTime = System.currentTimeMillis();
		for (int i = 0; i <= 1000; i++) {
			sb.append("J2EE");
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time Taken by StringBuilder:" + (endTime - starTime) + "ms");

	}

}
