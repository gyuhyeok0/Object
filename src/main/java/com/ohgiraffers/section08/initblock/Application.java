package com.ohgiraffers.section08.initblock;

public class Application {

    /* 수업목표. 초기화 블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성 할 수 있다.
        안중요
     */
    /*
        필기.
            초기화 블럭
            복잡한 초기화를 수행 할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
            1. 인스턴스 초기화 블럭
            : 인스턴스가 생성되는 시점에 생성자 홏ㄹ 이전에 먼저 실행이 된다.
            인스턴스 호출하는 시점마다 호출이 된다.
            인스턴스 변수를 초기화 하며, 정적필드에는 실행 시점마다 갚을 덮어쓴다.
            {
                초기화 내용
            }
            2. 정적 초기화 블럭
            : 클래스가 로드 될때 한번 동작한다.
                정적 필드를 초기화 하며, 인스턴스 변수는 초기화 하지 못한다.
            static{
                초기화 내용 작성
            }
     */
    public static void main(String[] args) {

        Product product = new Product() ;
        /* 목차.1 자료형 별 기본값으로 초기화 된 내용 확인

         */
//        System.out.println(product.getInfo());

        System.out.println(product.getInfo());

        System.out.println(product.getInfo());

        Product product2 = new Product("대륙폰", 3000, "샤우미");
        System.out.println(product2.getInfo());

        /*필기.
            여기서 알 수 있는 초기화 순서는
            인스터스 변수 : 기본값 -> 명시적 초기값 -> 인스턴스 초기화 블럭 -> 생성자
            클래스 변수 : 기본값 -> 명시적 초기값 -> 정적초기화 -> 인스턴스 초기화 블럭 -> 생성자
         */
    }
}
