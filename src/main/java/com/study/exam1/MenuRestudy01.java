package com.study.exam1;

import java.util.Scanner;

public class MenuRestudy01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            System.out.print("입력 : ");
            int inputValue = scanner.nextInt(); // 번호 입력
            // int를 입력 받을 때는 nextInt 메서드를 이용한다


            System.out.println("입력한 번호: " + inputValue);
            if(inputValue == 0){
                System.out.println("프로그램을 종료합니다.");
                flag = false; // 0번을 입력하면 프로그램을 종료 합니다
            } else if(inputValue == 1) {
                System.out.println("1번으로 들어왔습니다.");
                // 혹은 1번을 누르면 1번으로 들어왔습니다 출력 .
            boolean flag2 = true; //
            while (flag2) { // flag변수가 true 소 대입하였기에 조건문 자체가 항상 참이 된다.
                            // while 문 안에 속해 있는 문장들(출력문, inputvalue입력문)
                            // 무한하게 while 문 내에 문장들을 수행한다.
                System.out.println("1번에서 입력: ");
                inputValue = scanner.nextInt();

                System.out.println("입력한 번호: " +inputValue);
                if(inputValue == 0) { // 0번을 입력하면 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    flag2 = false;
                } else if (inputValue == -1) {
                    System.out.println("뒤로가기");
                    flag2 = false;
                } else if(inputValue == 1) {
                    System.out.println("1번에서 1번으로 들어왔습니다. ");
                    // 1번에서 입력에서 1번을 누르면 출력.
                } else if(inputValue == 2) {
                    System.out.println("1번에서 2번으로 들어왔습니다.");

                } else {
                    System.out.println("다시 입력하세요");
                    // 2번 이외에 다른 숫자가 입력이 될 경우 출력.
                }
                System.out.println();
            }
            } else if(inputValue == 2) {
                System.out.println("2번으로 들어왔습니다.");
            } else {
                System.out.println("다시 입력하세요");
            }
            System.out.println();
        }

    }

}
