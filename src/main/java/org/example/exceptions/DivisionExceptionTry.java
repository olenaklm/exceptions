package org.example.exceptions;

import java.util.Scanner;

public class DivisionExceptionTry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            i++;
            int a = in.nextInt();
            int b = in.nextInt();
            try {
                int div = a / b;
                System.out.println("a / b = " + div);

                int mult = a * b;
                System.out.println("a * b = " + mult);
            } catch (ArithmeticException ex) {
                System.out.println("Division by 0");
            }
        }
    }
}
