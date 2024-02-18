package com.ohgiraffers.section02.encapsulation.test;

// Monster 클래스
public class Monster {
    private String name;
    private int[] powers = new int[3];

    public void setName(String name) {
        this.name = name;
    }

    public void setPowers(int[] powers) {
        this.powers = powers.clone(); // 깊은 복사
    }

    public String getName() {
        return this.name;
    }

    public int getTotalPower() {
        int total = 0;
        for (int i = 0; i < this.powers.length; i++) {
            total += this.powers[i];
        }
        return total;
    }

    public void powerUp(int index, int power) {
        if (index >= 0 && index < this.powers.length) {
            this.powers[index] += power;
            int num;
            int num3;
        }
    }

    
}
