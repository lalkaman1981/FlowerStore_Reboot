package com.demo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AppUser user = new AppUser();
        user.setDate(LocalDate.of(2020, 1, 1));
        System.out.println(user.getAge());
    }
}
