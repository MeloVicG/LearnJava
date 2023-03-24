package com.practiceudemy.peopledbweb.data;

import com.practiceudemy.peopledbweb.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//whenever application runs up after spring
@Component // this is interesting because of @Component, without this it will ignore this class
public class PersonDataLoader implements ApplicationRunner {
    private PersonRepository personRepository;

    // alt + insert = Generate
    // spring will see this constructor requires a person repository to be passed in and spring will check its own internal registry bean
    // - hey I want you to give me an instance of repository
    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override   //this is what i get to do after spring starts
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Running stuff here");
        if (personRepository.count() == 0) {
            List<Person> people = List.of(new Person(null, "brock", "purdy", LocalDate.of(1950, 1, 1), new BigDecimal("50000")),
                                          new Person(null, "sasuke", "uchiha", LocalDate.of(1950, 1, 1), new BigDecimal("60000")),
                                          new Person(null, "naruto", "uzumaki", LocalDate.of(1950, 1, 1), new BigDecimal("70000")),
                                          new Person(null, "victor", "kayi", LocalDate.of(1950, 1, 1), new BigDecimal("80000"))
            );
            personRepository.saveAll(people);
        }
    }
}
