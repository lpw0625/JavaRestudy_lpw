package com.study.restudy1;

public class Functionexam1 {

    public static void hello() {
        System.out.println("Hello Java");
    } // Hello의 끝.


    public static void multi(int a, int b) {

        System.out.println(a + "*" + b + "=" + (a * b));
    } // multi() 끝.

    public static int abs(int a) {
        if (a < 0) {
            a = a * -1;
            return a;

        } else {
            return a;

        }
    }// abs의 끝

    public static int max(int a, int b) {
        if (a >= b) {
            return a;

        } else {
            return b;
        }
        // max()의 끝
    }

    public static void main(String[] args) {
        // 함수호출
                // 1)  hello() 호출하면 "Hello Java"를 출력하는 함수
        hello();
        // 20 multi(10,20) 호출하면 10*20=200" 출력
        multi(10,20);
        // abs(-5) 호출하면 절대값을 리턴해줌.
        int a = abs(-4);
        System.out.println(a);

        // max (10,20) 호출이면 큰 변수를 리턴
        int bigger = max(20,30);
        System.out.println(bigger);


    } // main의 끝.
}
