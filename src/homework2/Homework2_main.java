package homework2;

import java.util.Arrays;

public class Homework2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[][] = {{0, 1}, {2, 0}, {0,3}};
		double b[][] = {{1, -1, 2}, {3, 0, 4}};
		Homework2_lib hlib = new Homework2_lib(a,b);
		System.out.println("Product = "+Arrays.deepToString(hlib.getProduct()));
		System.out.println("Transpose = "+Arrays.deepToString(hlib.getTranspose(b)));
	}
}
