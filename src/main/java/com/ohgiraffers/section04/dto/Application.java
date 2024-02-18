package com.ohgiraffers.section04.dto;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 생성자를 이용한 초기화와 설정자를 이용한 초기화의 장단점을 이해 할 수 있다.
            필기.
                생성자를 이용한 초기화
                장점- setter 메소드를 여러번 호출헤서 사용하지 않고 단 한번의 인스턴스 생성 및 초기화 할 수 있다.
                단점 - 필드를 초기화 할 매개변수의 갯수를 경우의 수 별로 모두 만들어야 한다.
                        호출 시 인자가 많아지는 경우 어떤한 값이 어떤 필드를 의미하는 지 한 눈에 보기 어렵다.
                2. 설정자를 이용한 초기화
                장점- 필드 초기화 하는 각각의 값들이 어떤 필드를 초기화 하는 지 명확하게 볼 수 있다.
         */
        UserDTO user1 = new UserDTO("ohgiraffers", "ohgiraffers", "ohgiraffers", new java.util.Date());
        System.out.println(user1.getInfo());

//        UserDTO user2 = new UserDTO();
//        user2.setId("ohgiraffers");
//        user2.setPwd("ohgiraffers");
//        user2.setName("ohgiraffers");
//        user2.setEnrollDate(new java.util.Date());
//        System.out.println(user2.getInfo());
    }
}
