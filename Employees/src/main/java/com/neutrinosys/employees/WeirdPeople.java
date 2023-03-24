package com.neutrinosys.employees;

import java.time.LocalDate;

public record WeirdPeople(String lastName, String firstName, LocalDate dob) implements Apple{ //no Apple class just practice
    public WeirdPeople(String lastName, String firstName){
        this(firstName, lastName, LocalDate.of(1,1,1));
    }

    public String sayHello(){
        return "hello people";
    }
}
