package com.pe.relari.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeUtil {

    public static void separation() {
        System.out.println("\n--------------------------------------\n");
    }

    public static String getDateFormat(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date);
    }

}
