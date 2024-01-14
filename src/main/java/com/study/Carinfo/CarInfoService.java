package com.study.Carinfo;

import java.util.Scanner;

public class CarInfoService {

    String inputValue(String label) {

        Scanner scanner = new Scanner(System.in);
        String info = null;

        while (true) {
            System.out.println(label + "(자동차 입력 취소 : exit" );
            info = scanner.nextLine(); // 취소버튼을 입력
            if(!info.isBlank()) { // 공백이 없다면 즉, 입력이 됐다면
                break; // 브레이크.
            }
        }
        return info;
}

boolean addCarInfo() {
    String name = null;
    String color = null;
    String carType = null;
    String price = null;
    String horsePower = null;

    System.out.println("<<< 자동차 정보 입력. >>>> ");
    name = inputValue("자동차 이름 >>> ");
    if("exit".equalsIgnoreCase(name)) { // 메소드의 대소문자 구분을 하지 않고비교.
        return false;

    }
    color = inputValue("자동차 색상 >>> ");
    if("exit")





}