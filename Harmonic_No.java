package day_5_assignments;

import java.util.Scanner;

public class Harmonic_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 0, i;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();

		System.out.println("The Harmonic Value for the number is :" + num);
		for (i = 1; i <= num; i++) {
			result = (1 / i);
			System.out.println(result);
		}
	}

}
