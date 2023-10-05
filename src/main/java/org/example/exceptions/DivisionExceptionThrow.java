package org.example.exceptions;

import java.util.Scanner;

public class DivisionExceptionThrow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            i++;
            int a = in.nextInt();
            int b = in.nextInt();
            try {

                if (b == 0) {
                    throw new ArithmeticException();
                }
                int mult = a * b;
                System.out.println("a * b = " + mult);
                int div = a / b;
                System.out.println("a / b = " + div);
            } catch (ArithmeticException ex) {
                System.out.println("Division by 0");
            }
        }
    }
}
