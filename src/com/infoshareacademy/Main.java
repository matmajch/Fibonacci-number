package com.infoshareacademy;

public class Main {

    public static long fibonacci(int a) {

        long score = 0;

        if(a>1) {
            long fib[] = new long[a];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < a; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            score = fib[a - 1] + fib[a - 2];
        } else if (a == 1){
            score = 1;
        } else if (a == 0){
            score = 0;
        }
        return score;
    }


    public static void main(String[] args) {


        System.out.println("The value of Fibonacci number for n = 0 is " + fibonacci(0));
        System.out.println("The value of Fibonacci number for n = 1 is " + fibonacci(1));
        System.out.println("The value of Fibonacci number for n = 2 is " + fibonacci(2));
        System.out.println("The value of Fibonacci number for n = 3 is " + fibonacci(3));
        System.out.println("The value of Fibonacci number for n = 11 is " + fibonacci(11));
        System.out.println("The value of Fibonacci number for n = 35 is " + fibonacci(35));
        System.out.println("The value of Fibonacci number for n = 100 is " + fibonacci(100));
    }



    }

