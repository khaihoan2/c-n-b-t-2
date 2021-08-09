package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao a=");
        a = sc.nextDouble();
        System.out.println("nhap vao b=");
        b = sc.nextDouble();
        System.out.println("nhap vao c=");
        c = sc.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        double delta = qe.getDiscriminant();
        double r1,r2;
        r1 = qe.getRoot1(delta);
        r2 = qe.getRoot2(delta);
        if (delta >0){
            System.out.print("r1 ="+r1+","+"r2 =" + r2);
        }else if (delta ==0){
            System.out.print("r1 = r2 ="+r1);
        }else {
            System.out.print("vô nghiệm");
        }
    }
}
