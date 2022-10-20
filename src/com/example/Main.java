package com.example;

public class Main {

    public static void main(String[] args) {
//        task1();
        task2();
    }

    private static void task1() {
        System.out.println(TangentSum.get(Math.toRadians(45), Math.toRadians(30)));;
    }

    public static void task2(){
        // Legendre polynomials
        System.out.println(Legendre.getUpTo(1, 0.5));
        System.out.println(Legendre.getUpTo(2, 0.5));
        System.out.println(Legendre.getUpTo(3, 0.5));
        System.out.println(Legendre.getUpTo(4, 0.5));
        System.out.println(Legendre.getUpTo(5, 0.5));
    }

}
