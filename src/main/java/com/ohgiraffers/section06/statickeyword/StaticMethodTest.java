package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {

        this.count++;
        System.out.println("nonStaticMethod 호출됨...");
    }

    public static void staticMethod() {

//        this.count++;  //필기. 스테틱 메서드는 주소가 없기 때문에 오류가 뜬다.
        System.out.println("staticMethod");
    }


}
