package com.practiceudemy.peopledbweb.data;

import com.practiceudemy.peopledbweb.biz.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //dynamically creates code at run time
public interface PersonRepository extends CrudRepository<Person, Long> {

}
