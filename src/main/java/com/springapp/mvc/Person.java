package com.springapp.mvc;

import org.springframework.stereotype.Component;

public class Person
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
