package com.ohgiraffers.section05.overleading.Overloading;

public class Test {

    /* 수업목표. 오버로딩에 대해 이해 할 수있다.
        오버로딩의 사용 이유
        매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
        이 때, 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고
        관리하기가 매우 어려울것이다.
        규모가 작은 프로그램의 경우는 정도가 덜 하겠지만, 규모가 거대해지면 메소드 또한
        관리하기 힘들어진다.
        따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를
        동일한 이름으로 관리하기 위해 사용하는 기술을 오버로딩 이라고 한다.
     */

    /*필기
        오버로딩의 조건
        동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수 순서를
        다르게 작성하여 한 클래스 내에 동일한 이름의 메소드를 여러개 작성 가능
        메소드의 시그니쳐가 다르면 다른 메소드로 인식하기 때문에
        즉, 시그니쳐 중 메소드 이름은 동일해야 하기 때문에
        파라미터(매개변수) 선언부가 다르게 작성되어야 오버로딩이 성립된다.
     */
    /* 필기.
        메소드의 시그니쳐란
        public void method(int num) {} ㅣ아라는 메소드의 메소드명과 파라미터 선언부 부분을 시그니쳐 라고 한다.
        즉, method(int num) <- 이부분이 시그니쳐이다.
        메소드의 접근제한자나 봔환형은 오버로딩 성립 요건에 해당 되지 않는다.
     */
    public void test() {}
    // 시그니쳐가 동일한 경우 오류를 발생한다.
//    public void test() {}
    // 접근제한자에 따른 오버로딩 성립 확인
//    private void test(){}
    // 반환형에 따른 오버로딩 성립 확인
//    public int test() {return 0;}
    // 매개변수 유무에 따른 오버로딩 성립 확인
    public void test(int num) {}    //파리미터 선언부는 메소드 시그니처에 해당
//    public void test(int num2) {} // 매개변수의 이름은 시그니처에 영향을 주지 않는다.
    public void test(int num1, int num2) {}
    public void test(int num, String name) {}
    public void test(String name, int num) {}
    
    







}
