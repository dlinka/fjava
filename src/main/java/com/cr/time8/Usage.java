package com.cr.time8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Usage {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2018, 9, 9));
        System.out.println(LocalDateTime.of(2018, 9, 9, 9, 9, 9).toLocalDate());

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2018, 9, 9, 9, 9, 9));
        System.out.println(LocalDate.now().atTime(9, 9, 9));
        System.out.println(LocalTime.now().atDate(LocalDate.of(2018, 9, 9)));
        System.out.println(LocalDateTime.now().withHour(9).withMinute(9).withSecond(9));
        System.out.println(LocalDateTime.now().plusHours(2).plusMinutes(2));

        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        Long millisecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        LocalDateTime time = Instant.ofEpochMilli(millisecond).atZone(ZoneId.systemDefault()).toLocalDateTime();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDateTime.now().format(formatter));
        System.out.println(formatter.format(LocalDateTime.now()));
        System.out.println(LocalDateTime.parse("2020-07-01 14:17:57", formatter));

        System.out.println(new Date().toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime());
        System.out.println(Date.from(LocalDateTime.now().toInstant(ZoneOffset.of("+8"))));

        System.out.println(Instant.now());
        System.out.println(Instant.ofEpochMilli(System.currentTimeMillis()));
        System.out.println(Instant.ofEpochMilli(new Date().getTime()));
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+08:00")));
        System.out.println(Instant.now().getEpochSecond());
        System.out.println(Instant.now().toEpochMilli());

        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now().atZone(ZoneId.systemDefault()));
        System.out.println(ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.systemDefault()));
    }
}
