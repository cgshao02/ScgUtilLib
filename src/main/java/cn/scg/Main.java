package cn.scg;

import cn.scg.util.DateUtils;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        long dateTimeNo = DateUtils.getDateTimeNo(date);
        System.out.println(dateTimeNo);

        long millisecondTimestamp = DateUtils.toMillisecondTimestamp(date);
        System.out.println("millisecondTimestamp = " + millisecondTimestamp);
    }
}