package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberList2 = null; // 주소가 없는 아무것도 없는 메모리
        List<Integer> numberList3 = null;
        List<Integer> numberList4 = null;
        List<Integer> numberList5 = null;

        numberList5 = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            Integer num = numberList.get(i);
            numberList5.add(num * 10);
        }

        numberList2 = new ArrayList<>(); // 주소 초기화
        for (Integer number : numberList) { // Integer타입의 numberList를 number에 순회한다
            numberList2.add(number * 10); // numberList2에 add-더해준다 (number * 10)을
        }

        numberList4 = new ArrayList<>();
        numberList.forEach(number -> numberList4.add(number * 10)); // 람다식

        numberList3 = numberList.stream() // Stream<Integer>
                .map(number -> number * 10)
                .collect(Collectors.toList());

        System.out.println(numberList);
        System.out.println(numberList2);
        System.out.println(numberList3);
        System.out.println(numberList4);
        System.out.println(numberList5);
    }
}