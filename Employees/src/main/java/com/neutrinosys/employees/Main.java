package com.neutrinosys.employees;

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String people = """
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000, yoe=1, iq=140}
            Rubble, Barney, 2/2/1905, Manager, {locpd=1200, yoe=17, iq=110}
            Flinstone, Wilma, 3/3/1910, Analyst, {locpd=5000, yoe=3, iq=120}
            Rubble, Betty, 4/4/1915, CEO, {locpd=1000, yoe=10, iq=145}
            """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);

        int totalSalaries = 0;
        while (mat.find()) {
            totalSalaries += switch(mat.group("role")){
//                case "Programmer" -> 3000;
                case "Programmer" -> {
                    yield 300;
                }
//                case "Manager" -> 3500;
                case "Manager" -> {
                    yield 3500;
                }
//                case "Analyst" -> 2500;
                case "Analyst" -> {
                    yield 2500;
                }
//                case "CEO" -> 5000;
                case "CEO" -> {
                    yield 5000;
                }
                default -> 0;
            };
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.printf("The total pay should be %s%n", currencyInstance.format(totalSalaries));


    }
}




