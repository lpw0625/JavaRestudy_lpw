package com.study.Ifstudy;

import java.util.Scanner;

public class IfRestudy1 {
    public static void main(String[] args) {

        // 성적에 따른 등급 나누기
        Scanner scanner =  new Scanner(System.in);
        int score;

        score = scanner.nextInt();

        if(score >= 95) {
            System.out.println("등급은 A등급");
        } else if(score >= 85) {
            System.out.println("등급은 B등급");
        } else if(score >= 75) {
            System.out.println("등급은 C등급");

        } else if(score >= 65) {
            System.out.println("등급은 D등급");

        } else {
            System.out.println("등급은 F등급");

        }
    }
}
