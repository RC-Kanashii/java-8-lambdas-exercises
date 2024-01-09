package com.insightfullogic.java8.answers.chapter2;

import org.junit.Test;

import java.util.function.Predicate;

public class Question3Test {

    @Test
    public void test() {
        Runnable helloWorld = () -> System.out.println("hello");
        helloWorld.run();


    }

//    interface IntPred {
//        boolean test(Integer val);
//    }
//
//    boolean check(Predicate<Integer> predicate) {
//        return predicate.test();
//    }
}
