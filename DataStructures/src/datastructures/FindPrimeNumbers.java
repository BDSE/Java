package datastructures;

import java.util.Scanner;

public class FindPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit:");
		long number = sc.nextInt();
		listPrimeNumbers(number);
	}

	public static void listPrimeNumbers(long number) {
		int flag;
		for (long i = 3; i <= number; i += 2) {
			flag = 0;
			for (long j = 3; j <= (int) i / 2; j += 2) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.print(i+" ");
		}
	}

}
