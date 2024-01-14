package com.study.restudy2;

public class Operation3 {

    public static void main(String[] args) {
        /*
     boolean b1 = true;
     boolean b2 = false;
     boolean b3 = true;
     boolean b4 = false;


     // 논리 연산자 [&&]

        System.out.println(b1 && b2);
        // b1은 true b2는 false 이므로 둘 다 true가 아니기에 false가 나온다.

        System.out.println(b1 && b3);
        // b1 true b3도 true 이므로 둘 다 true이기에 true가 나온다. (논리곱)

        System.out.println(b2 && b4);
        // b2 false b4도 false 이므로 둘 다 false이기에 false다.



        // 논리 연산자 [||]

        System.out.println(b1 || b2);
        // 논리합 : b1 true이고 b2 false 둘 중 하나가 true여도 true 리턴.
        System.out.println(b1 || b3);
        // 당연히 둘 다 true이면 리턴

        System.out.println(b2 || b2);
        // false나오게 할려면 두 식이 false일 때 논리합도 false 리턴.


        // 논리부정 !

         */
       int a = 5;
       int b = 3;

        if( ! (a < b) && (b > a)) {

return;
            // true 옆에 논리부정인 !달았기에
            // 값이 false라면 출력.

        }
    }
}