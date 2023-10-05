package org.example.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class DivisionExceptionThrows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            i++;
            int a = in.nextInt();
            int b = in.nextInt();
            try {
                int div = divide(a, b);
                System.out.println("a / b = " + div);

                int mult = a * b;
                System.out.println("a * b = " + mult);
            } catch (RuntimeException ex2) {
                System.out.println("RuntimeException");
            }
//            catch (ArithmeticException ex) {
//                System.out.println("Division by 0");
//            }
            catch (IOException ex1) {
                System.out.println(ex1);
            }
        }
    }

    private static int divide(int a, int b) throws ArithmeticException, IOException, RuntimeException {
        if ( a == 1 ) {
            throw new IOException();
        }
        return a / b;
    }
}
