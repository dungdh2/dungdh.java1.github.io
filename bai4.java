package btvn4_buoi7;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n ");
		int n = sc.nextInt();
		double a[] = new double[n];
		nhap(n, a, sc);
		System.out.println(tim(n, a));

	}

	public static void nhap(int n, double a[], Scanner sc) {

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

	}

	public static double tim(int n, double a[]) {
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				return a[i];
			}
		}
		return -1;

	}

}
