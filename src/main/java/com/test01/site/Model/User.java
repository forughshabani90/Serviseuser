package com.test01.site.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;

@Entity

public class User {
    @Id
    private long id;
    private String name;
    private int age;
    private String gender;

    }

