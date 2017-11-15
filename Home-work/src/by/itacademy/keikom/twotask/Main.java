package by.itacademy.keikom.twotask;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String args[]) {
		
		Integer id = 0;
		Integer [] arr_a = new Integer [5];
		Integer [] arr_b = new Integer [5];
		Integer [] arr_c = new Integer [5];
		
		inputArray(arr_a);
		inputArray(arr_b);
		inputArray(arr_c);
		
		Arrays.sort(arr_a);
		Arrays.sort(arr_b);
		Arrays.sort(arr_c);
		
		showArray(arr_a);
		showArray(arr_b);
		showArray(arr_c);
		
		for (int i = 0; i < arr_a.length; i++) { 
			for (int j = 0; j < arr_b.length; j ++) {
				id++;
				checkEquality(arr_a, arr_b, arr_c, i, j);
			}
		}
	}

	private static void checkEquality(Integer[] arr_a, Integer[] arr_b, Integer[] arr_c, int i, int j) {
		
		for (int n = 0; n < arr_c.length; n++) {
			
			if (arr_a[i] + arr_b[j] == arr_c[n] ) {
				System.out.println("a[" + i + "]: " + arr_a[i] + " + " + "b[" + j + "]: " + arr_b[j] + " = " + arr_c[n]);
			}
		}
	}

	private static void showArray(Integer[] arr_a) {
		System.out.print("[");
		for (Integer i: arr_a) {
			System.out.print(i + "\t");
		}
		System.out.println("]");
	}

	private static void inputArray(Integer[] arr_a) {
		for (int i = 0; i < arr_a.length; i++) {
			arr_a[i] = new Random().nextInt(10);
		}
	}
}
