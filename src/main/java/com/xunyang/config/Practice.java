package com.xunyang.config;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3,3);
        System.out.println(nums);
//        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        List<Integer> collect = nums.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(collect);


//        System.out.println(b);
    }
}
