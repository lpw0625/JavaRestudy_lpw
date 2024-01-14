package com.study.Carinfo;

public class Car {

    // 자동차 정보가 담긴 클래스.

    String name;
    String color;
    String carType;

    int price;
    int horsePower;

    // 생성자
    // 1 클래스 이름과 동일.
    // 2. 메소드의 형태.


    public Car(String name, String color, String carType, int price, int horsePower) {
        // 매개변수를 가진 Car 생성자.


        this.name = name;
        this.color = color;
        this.carType = carType;
        this.price = price;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", carType='" + carType + '\'' +
                ", price=" + price +
                ", horsePower=" + horsePower +
                '}';
    }
}