package com.Chen.utils;

import org.junit.Test;

import java.util.UUID;

public class IDUtils {
    public static String getRandomId(){
        //UUID生成随机ID
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void testID(){
        System.out.println(IDUtils.getRandomId());
    }
}
