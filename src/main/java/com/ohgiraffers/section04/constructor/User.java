package com.ohgiraffers.section04.constructor;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

/* 필기.
    생성자의 작성 위치
    문법상으로 클래스 내부에 작성하면 되지만,
    통상적으로 필드 선어부와 메소드 선언부 사이에 적는 것이 관례이다
    생성자의 사용 목적
    1.인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
    매개변수 있는 생성자의 경우 매개변수로 전달 받은 값으로 필드를 초기화하며
    인스턴스를 생성할 목적으로 주로 사용된다.
    작성한 생성자 외에는 인스턴스를 생성하는 방법을 재ㅔ공하지 않는다는 의미
    따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 상용 할 수 있다. (초기값 전달 강제)
 */

/* 목차. 기본 생성자(default constructor)*/
    public User(){            // 필기. 매개변수가 있는 생성자가 존재하는 경우 기본생성자를 명시적으로 작성해줘야 한다.

        System.out.println("User 클래스 기본 생성자 호출함");
    }

    /*목차.2 매개변수 있는 생성자 */
    public User(String id, String pwd, String name) {
        /* 필기. 매개변수 있는 생성자의 주 목적은 인스턴스 생성 시점에 매개변수로 전달.
            받은 값을 이용해서 필드를 초기화 하는 목적이다.
         */
        this.id= id;
        this.pwd= pwd;
        this.name= name;

        System.out.println("User 클래스의 id, pwd, name");
    }
    /* 목차. 3. 모든 필드를 초기화 하는 생성자*/
    public User(String id, String pwd, String name, java.util.Date enrollDate) {
//        this.id= id;
//        this.pwd= pwd;
//        this.name= name;
//        this.enrollDate =enrollDate;
        /* 목차. 3-2. 사전에 작성 되어 있는 다른 생성자 초기화*/
        this(id, pwd, name);
        this.enrollDate = enrollDate;
        System.out.println("User 클래스의 모든 필드를 초기화 하는 생성자를 호출함");
    }

    public String getInfo() {

        return "User [id= " + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }

    public void app1(String id, String pwd, String name){
        this.id= id;
        this.pwd= pwd;
        this.name= name;
        System.out.println("User [id= " + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]");

    }                                                               //메롱




}
