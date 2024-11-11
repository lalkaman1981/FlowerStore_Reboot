package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;

    @Transient
    private int age;
    private LocalDate date;

    public int getAge() {
        return Period.between(date, LocalDate.now()).getYears();
    }
}
