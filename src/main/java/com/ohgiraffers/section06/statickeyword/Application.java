package com.ohgiraffers.section06.statickeyword;

public class Application {
    /* 수업목표.
        필기.
     */
    public static void main(String[] args) {
    //목차. 1. static 키워드를 필드에서 사용해보자

    StaticFieldTest sft1 = new StaticFieldTest();
        System.out.println("non-static filed : " + sft1.getNonStaticCount());
        System.out.println("static filed : " + sft1.getStaticCount());

            sft1.increaseStaticCount();
            sft1.increaseNonStaticCount();

        System.out.println("+++");

        System.out.println(sft1.getNonStaticCount());                    //0
        System.out.println(sft1.getNonStaticCount());                    //0

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println(sft2.getNonStaticCount());                    //0
        System.out.println(sft2.getStaticCount());                       //1

        /* 필기.
            인스턴스 변수의 경우 sft1과 sft2 두개의 인스턴스가 서로 공유하지 못하고 기본값으로 초기화된다.
            하지만 static 은 유지됨.
         */
        StaticFieldTest smt = new StaticFieldTest();
        smt.increaseNonStaticCount();

        /* 주의사항
            static 메서드도 이렇게 호출 가능하다.
            하지만 인스턴스를 생성하지 않고 호출하는 방식으로 사용해야한다.
            static 메서드는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로
            만들기 때문에 static 메소드르 호출하는 방식으로 호출해야한다.
         */
        StaticMethodTest sms = new StaticMethodTest();
        sms.staticMethod();    // 비권장

        StaticMethodTest.staticMethod(); // 권장

    }



}
