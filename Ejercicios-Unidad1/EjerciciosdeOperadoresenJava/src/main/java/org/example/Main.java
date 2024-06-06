package org.example;


public class Main {

    private static final int a=8;
    private static final int b=3;
    private static final int c=-5;

    public static void main(String[] args) {
        System.out.println("a+b+c="+(a+b+c));
        System.out.println("2*b+3*(a-c)="+(2*b+3*(a-c)));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        System.out.println("a/c="+(a/c));
        System.out.println("a%c="+(a%c));
        System.out.println("a*b/c="+(a*b/c));
        System.out.println("a*(b/c)="+(a*(b/c)));
        System.out.println("(a*c)%b="+((a*c)%b));
        System.out.println("a*(c%b)="+(a*(c%b)));
        System.out.println("(3*a-2*b)%(2*a-c)="+((3*a-2*b)%(2*a-c)));
        System.out.println("2*(a/5+(4-b*3))%(a+c-2)="+(2*(a/5+(4-b*3))%(a+c-2)));
        System.out.println("((a-3*b)%(c+2*a)/(a-c))="+((a-3*b)%(c+2*a)/(a-c)));
        System.out.println("(a-b-c*2)="+(a-b-c*2));
    }
}

