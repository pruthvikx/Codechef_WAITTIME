package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0;i<testCase;i++){
            int week = scan.nextInt();
            int days = scan.nextInt();
            System.out.println((week * 7) - days);
        }
    }
}
