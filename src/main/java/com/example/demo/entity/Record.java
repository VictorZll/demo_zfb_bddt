package com.example.demo.entity;

import java.util.Date;

public  class Record {
    private static String orderId=new Date().getTime()+"";

    public static String getOrderId() {
        return orderId;
    }
}
