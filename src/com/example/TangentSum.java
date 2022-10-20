package com.example;

public class TangentSum {

    public static double get(double a, double b){
        return (Math.tan(a) + Math.tan(b)) / (1 - Math.tan(a) * Math.tan(b));
    }
//
//    public static double tangent(double x) {
//        double accuracy = 0.0001;
//        int i = 1;
//        double cos = 1, sin = x, intermediateValueCos = 1, intermediateValueSin = x;
//        x = x % Math.PI;
//        while (Math.abs(intermediateValueCos *= - x * x / (2 * i * (2 * i - 1))) > accuracy
//                && Math.abs(intermediateValueSin *= - x * x / (2 * i * (2 * i + 1))) > accuracy) {
//            cos += intermediateValueCos;
//            sin += intermediateValueSin;
//            i++;
//        }
//        return sin / cos;
//    }
}
