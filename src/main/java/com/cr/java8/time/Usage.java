package com.cr.java8.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Usage {
    public static void main(String[] args) {

        //年月日
        LocalDate.now();
        LocalDate.of(2018, 9, 9);
        LocalDateTime.of(2018, 9, 9, 9, 9, 9).toLocalDate();

        //年月日时分秒
        LocalDateTime.now();
        LocalDateTime.of(2018, 9, 9, 9, 9, 9);
        LocalDate.now().atTime(9, 9, 9);
        LocalTime.now().atDate(LocalDate.of(2018, 9, 9));
        LocalDateTime.now().withHour(9).withMinute(9).withSecond(9);
        LocalDateTime.now().plusHours(2).plusMinutes(2);

        //秒
        LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));

        //毫秒
        Long millisecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        LocalDateTime time = Instant.ofEpochMilli(millisecond).atZone(ZoneId.systemDefault()).toLocalDateTime();

        //格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime.now().format(formatter);
        formatter.format(LocalDateTime.now());
        LocalDateTime.parse("2020-07-01 14:17:57", formatter);

        //Date
        new Date().toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
        Date.from(LocalDateTime.now().toInstant(ZoneOffset.of("+8")));

        //Instant
        System.out.println(Instant.now());
        System.out.println(Instant.ofEpochMilli(System.currentTimeMillis()));
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+08:00")));
        System.out.println(Instant.now().getEpochSecond());
        System.out.println(Instant.now().toEpochMilli());

        //ZonedDateTime
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now().atZone(ZoneId.systemDefault()));
        System.out.println(ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.systemDefault()));

    }
}
