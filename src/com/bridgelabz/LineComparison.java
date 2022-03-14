package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static double lengthCalculate(double x1, double y1, double x2, double y2){
    double length = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2 );
    return length;
}
    // Check Equality of Two Lines
    public static int lengthEquality(double length1, double length2){
        int flag;
        Double len1 = new Double(length1);
        Double len2 = new Double(length2);
        flag = len1.compareTo(len2);
        return flag;
    }
    public static void output(int flag){
        if (flag == 0){
            System.out.println("Both The Line Are Equal In Size");
        }else if (flag > 0){
            System.out.println("First Line is Bigger in Size");
        }else {
            System.out.println("Second Line is Bigger in Size");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the line comparison problem");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1, y1 and x2, y2 for line 1");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double length1 = lengthCalculate(x1,y1,x2,y2);
        System.out.println("Enter a1, b1 and a2, b2 for line 2");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double length2 = lengthCalculate(a1,b1,a2,b2);

        int flag = lengthEquality(length1, length2);
        output(flag);
    }
}
