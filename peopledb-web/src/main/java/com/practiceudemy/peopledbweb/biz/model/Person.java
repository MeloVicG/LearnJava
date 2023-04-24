package com.practiceudemy.peopledbweb.biz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data // this is lombok. generates - getters setters constructors hashcode 2string etc
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "First name can not be empty")
    private String firstName;

    @NotEmpty(message = "Last name can not be empty")
    private String lastName;

    @Past(message = " Dob must be past dates")
    private LocalDate dob;

//    @Email()
    private String email;
    private BigDecimal salary;

    // this is bad - dont do this unless necessary
    public String getFormattedDOB(){
        return DateTimeFormatter.ofPattern("MMMM dd, yyyy").format(dob);
    }
}

