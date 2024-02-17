package com.ohgiraffers.section02.encapsulation.test;


public class Application01 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.setName("드라큘라");
        monster1.setPowers(new int[] {10, 15, 20});

        System.out.println("monster1 name = " + monster1.getName());
        System.out.println("monster1 total power = " + monster1.getTotalPower());

        Monster monster2 = monster1;
        monster2.setName("프랑켄슈타인");
        monster2.setPowers(new int[] {20, 25, 30});
        monster2.powerUp(1, 10); // 인덱스 1의 파워를 10 증가

        System.out.println("monster2 name = " + monster2.getName());
        System.out.println("monster2 total power = " + monster2.getTotalPower());

        System.out.println("monster1 name = " + monster1.getName());
        System.out.println("monster1 total power = " + monster1.getTotalPower());
    }
}

