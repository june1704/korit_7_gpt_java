package com.korit.main;
/*
InterruptedException: 중간에 끼어든다

 */

public class Main7 {
    public static void main(String[] args) throws InterruptedException {

        // 익명클래스
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        System.out.println("첫번째 반복문 i: " + i);
                        Thread.sleep(1000); // 1초씩
                    } catch (InterruptedException e) { // 우회해서
                        System.out.println("프로그램에 오류가 발생함."); // 출력
                    }
                }
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Runnable runnable2 = () -> {
            for(int i = 0; i < 100; i++) {
                try {
                    System.out.println("두번째 반복문 i: " + i);
                    Thread.sleep(1000); // 1초씩
                } catch (InterruptedException e) {
                    System.out.println("프로그램에 오류가 발생함.");;
                }
            }
        };

        Thread t2 = new Thread(runnable2);
        t2.start();

        for(int i = 0; i < 100; i++) {
            System.out.println("MAIN Thread: " + i);
            Thread.sleep(1000);
        }
    }
}