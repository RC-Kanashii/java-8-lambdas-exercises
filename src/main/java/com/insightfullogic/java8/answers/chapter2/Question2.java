package com.insightfullogic.java8.answers.chapter2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static java.lang.ThreadLocal.withInitial;

public class Question2 {

     // ThreadLocal提供了一个withInitial()方法统一初始化所有线程的ThreadLocal的值
     public final static ThreadLocal<DateFormat> formatter = withInitial(() -> new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH));

}
