package com.example;

public class Legendre {
// https://en.wikipedia.org/wiki/Legendre_polynomials
    public static double getUpTo(int n, double x){
        if(n==0)
            return 1.;
        else if(n==1)
            return x;
        else
            return ((2*n-1)*x*getUpTo(n-1, x) - (n-1)*getUpTo(n-2, x)) / n;
    }
}