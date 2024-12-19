package com.korit.main;


import com.korit.util.ForEachPrinter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 제네릭
public class Main3 { // 클린코드
    public static boolean test() {
        return 10 % 2 == 0;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"a","b","c"};
        Integer[] numbers = new Integer[] {1,2,3};

        List<Integer> list = List.of(1,2,3,4,5); // 수정안됨

        // 이것도 되고 - 클린코드
        List<Integer> list2 = new ArrayList<>(); // 수정됨
        list2.addAll(list); // 불러옴
        list2.add(10); // 바꿈

        // 저것도 되고 - 리펙터링
        List<Integer> list3 = list.stream().collect(Collectors.toList()); // 새로운 리스트 만듬
        list3.add(20); // 바꿈




    }
}
