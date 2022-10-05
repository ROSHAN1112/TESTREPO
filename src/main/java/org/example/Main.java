package org.example;

class Main {

    public static void main(String[] args) {
        int first = 0, second = 1;
        System.out.print(first +" "+second);
        int next;
        for (int fibonacciCounter = 3; fibonacciCounter <= 10; fibonacciCounter++) {
            next = first + second;
            System.out.print(" "+next);
            first = second;
            second = next;
        }
    }
}