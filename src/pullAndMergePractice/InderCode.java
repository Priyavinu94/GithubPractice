package pullAndMergePractice;

public class InderCode {
	public static void main(String[] args) {
		// Write a program to find smallest and largest number in an array.
//		Find the minimum number:

		int[] num = { 10, 450, 12, 43, 56, 76, 34, 6, 5, 7, 1 };
		int min = num[0];

		for (int i = 1; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println(min);

//		Largest
		int[] num1 = { 10, 450, 12, 43, 56, 76, 34 };
		int max = num1[0];

		for (int i = 1; i < num1.length; i++) {
			if (max < num1[i]) {
				max = num1[i];
			}
		}
		System.out.println(max);
	}

}
