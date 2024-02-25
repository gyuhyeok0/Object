package com.ohgiraffers.section04.constructor;

public class Applicaiton01 {

    public static void main(String[] args) {
        /* 수업목표. 생성자 함수가 무언인지 인해하고 선언 및 호출할 수 잇다.
            필기.
                생성자란 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를
                생성할 떄 (new 키워드를 만날 때) 호출된다.
                생성자 함수에 매개변수가 없는 생성자를 기본 생성자
                기본생성자는 compiler 에 자동으로 추가되기 때문에 지금까지 명시적으로 사용할 수 있었다.
         */
        // 기본생성자
        User user1 = new User();
        System.out.println(user1.getInfo());
        //기본 생성자 매개변수
        User user2 = new User("user01", "pass01", "홍길동");
        System.out.println(user2.getInfo());

        /* 목차. 3. 모든 필드를 초기화 하는 생성자*/
        User user3 = new User("user01", "pass01", "홍길동", new java.util.Date());
        System.out.println(user3.getInfo());

        System.out.println("+++++");
        System.out.println("+++==+");


        user1.app1("user01", "pass02", "홍길동");

    }
}
