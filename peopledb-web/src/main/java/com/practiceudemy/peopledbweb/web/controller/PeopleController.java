package com.practiceudemy.peopledbweb.web.controller;


import com.practiceudemy.peopledbweb.biz.model.Person;
import com.practiceudemy.peopledbweb.data.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //here is an interesting class to register and manage for web stuff
@RequestMapping("/people")
public class PeopleController {
    // want this to depend on the repository
    private PersonRepository personRepository;

//    @Autowired - instance and inject repository
    // this will make controller depend on the person repository
    public PeopleController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // finds all the record that are in the person table (people table)
    @ModelAttribute("people") //this method wil run before the handle method below. this runs 1st, whatever comes out of this method gets stored in model and stored in key: people.
    public Iterable<Person> getPeople(){
        return personRepository.findAll();
    }

    @ModelAttribute //if you dont specify a name for thjs model. spring will tate return data type for the model
    public Person getPerson(){
        Person person = new Person();
        person.setFirstName("Jokester");
        return person;
    }

    @GetMapping //relates to CRUD - if request comes /people and its a get request. let this method handle request
    public String showPeoplePage(){  // Model model - dont need this in parameter anymore because line 26
        return "people"; //this handles people.html in templates (spring MVC)
    }
    @PostMapping
    public String savePerson(Person person){
        System.out.println(person);
        personRepository.save(person);
        return "redirect:people";
    }
}

// Model - has all the data that needs to be extracted from
// View - extracts from model to display
// Controller - controls the flow of interaction for MVC