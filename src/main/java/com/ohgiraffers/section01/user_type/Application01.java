package com.ohgiraffers.section01.user_type;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 클래스가 무엇인지 이해 후 작성,
            필기. 회원 정보를 관리
         */

        String id = "user01";
        String pwd = "pass01";
        String name = "조평훈";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"야구", "배드민턴", "탁구"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.print("hobby = " );
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

        /* 필기.
            이렇게 각각의 변수로 관리하게 되면 여러 가지 단점이 있다.
            1.변수명을 다 관리를 해야한다.
            2. 가독성 x
            3. 묶어서 리턴 x
         */

        /* 목차. 2. 사용자 정의의 자료형 사용하기
            
            필기.
                자료형 변수명 = new 클래스명(); - 지금까지 사용한 이 구문은 객체(instance)를 생성하는 구문이다.
                객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance) 가 생성된다.
         */

        Member member =new Member();

        /* 목차. 생성된 인스턴스의 초기값 확인하기
            필기.
                객체를 생성한 후 서로 다른 자료형들은 하나의 member 라는 변수명으로 관리 할 수 있도록
                공간을 생성한 것이다.
                heap 이라는 공간에 생성되기 때문에 jvm 이 제공하는 기본값들로 초기화 된다.
         */
        /* 필기.
            필드에 접근하기 위해서는 래퍼런스변수명. 필드명 <- 이렇게 접근한다.
            각 공간은 필드명으로 접근한다.
         */

        System.out.println("member.id : " + member.id);
        System.out.println("member.age = " + member.age);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.gender = " + member.gender);
        
        /* 목차. 필드에 접근해서 변수 사용하든 사용하기*/
        member.id = "user01";
        member.pwd = "조평훈";
        member.age = 20;
        member.hobby =  new String[] {"축구","볼링", "테니스"};

        System.out.println(member.id);
        System.out.println(member.pwd);
        System.out.println(member.age);
        System.out.println(member.hobby);
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }

    }

}
