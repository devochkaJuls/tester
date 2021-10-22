package com.juls;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateFormat dateFormat =  new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Сегодня отличный день " + dateFormat.format(new Date()));
    }
}
