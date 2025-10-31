package h2;

public class H2_main {
	public static void main(String[] args) {
	    int i = 4;
		int j = 5;
		int k = 7;
		int min = Math.min(Math.min(i, j), k);
		int max = Math.max(Math.max(i, j), k);
		System.out.println(min);
		System.out.println(max);
		}
}

