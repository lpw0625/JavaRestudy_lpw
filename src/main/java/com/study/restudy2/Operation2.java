package com.study.restudy2;

public class Operation2 {

    //비교 연산자
    // 대소 (<, <=, >,>=) 또는 동등(==, !=) 비교해서
    // booolean 타입인 true/false 를 산출
    // 즉, boolean타입에서 결과가 나오는 true/false값을 나온다.

    public static void main(String[] args) {

        System.out.println(true);
        System.out.println(false);


        boolean num = 20 > 23;

        System.out.println(" > " + " 결과는 : " + num);
        System.out.println( " < " + " 결과는 : " + (20 < 23));
        System.out.println( " < " + " 결과는 : " + (20 >= 20 ));
        System.out.println( " < " + " 결과는 : " + (20 <= 23));
        System.out.println( " < " + " 결과는 : " + (20 == 23));
        System.out.println( " < " + " 결과는 : " + (20 != 23));
        System.out.println();
       // "!" : 반전
        // ==, != : 비교 용도로 쓰이지만 문자열이 똑같은지 다른지에 대해 비교할때는 쓰지 않는다.
    }





}
