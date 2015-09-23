package com.springapp.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserInfo
{
    @Size(min=3, max = 20, message="lastName should be between 3 and 20")
    private String lastName;

    @Size(min=3, max = 20, message="firstName should be between 3 and 20")
    private String firstName;

    @Size(min=3, max = 99, message="age should be between 3 and 99")
    @NotNull(message = "not null")
    private Integer age;

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Integer getAge()
    {
        return age;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }
}
