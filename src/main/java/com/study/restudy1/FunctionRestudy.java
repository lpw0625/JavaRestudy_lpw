package com.study.restudy1;

public class FunctionRestudy {

    // 사용자 정의 하수
    // 리턴할 자료형 함수이름(매개변수)
    // 자주사용되는 명령문 ==>>> 실행문이 오는 자리가아닌 함수가 오는자리이다.


    //1) 매개변수, 리턴 값이 모두 없는 함수 >>> 매개변수는 "입력" 리턴값은 "출력"이라는 개념이다.

    public static void star() {   //==> void : 공허하다, 비어있다 라는 뜻으로 여기서는 리턴값이 없다라는 의미이다.
        // 특정목적으로 자주 사용되는 명령을 함수로 정의 해서 호출을 해서 쓴다.

        System.out.println("+++++++++++++++++"); //순차문: 첫번째 명령문이 끝나야 다음번이 실행이 된다.

        System.out.println("+++++++++++++++++");


    } // star 의 끝.


    public static void under() {
        // 언더바를 출력하는 화면을함수로 정의 해서 호출해서 쓴다.

        System.out.println("________________________");
    } // under()의 끝.


    //  2) 매개변수는 존재 리턴 값이 없는 함수
    public static void addOne(int a) { // 변수를 코드블록 안에서 가공처리 한다 반환(리턴)
        a++;
        System.out.println("받은값+1 " + a);



    } // addOne의 끝

// 3) 매개변수는 없고 리턴값은 있는 함수.
    public static int getFive() {

        int num = 5;
        return  num; // 여기까지 실행하고 변수 5를 호출한 곳으로 돌아가라.


        // 함수 안에서 선언된 변수(지역 변수)는 다른 함수에서 사용 불가. 다른 함수에서 같은 지역변수명을 쓸수있다.
    } // getFive()


    // 매개 변수도 있고 리턴값도 있는 함수.
    public static int addNum(int a, int b) {
        int result = a + b;
        return  result; // 이때 result = a + b; 의 동일한 값을 얻는다.


    } //addNum()끝

    public static void main(String[] args) {
        // 메소드
        // 메소드는 클래스 안에서만 들어올수 있다.

        // 함수(메소드): 자주 사용되는 명령 정의 필요시 함수이름 호출해서 사용.

        star();
        under();
        addOne(5);
        System.out.println(getFive());
        // System.out.println(num); 함수에서 정의한 변수를 쓸수 없다.
        int result = addNum(10,20);
        System.out.println("result = " + result);
    }


}
