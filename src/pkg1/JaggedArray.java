package pkg1;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] nums = new int[4][];

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter " + (i + 1) + " Array size: ");
			int size = sc.nextInt();
			nums[i] = new int[size];
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print("Enter [" + i + "][" + j + "] value: ");
				nums[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}
}
