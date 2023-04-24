package com.practiceudemy.peopledbweb.web.controller;


import com.practiceudemy.peopledbweb.biz.model.Person;
import com.practiceudemy.peopledbweb.data.PersonRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public String savePerson(@Valid Person person, Errors errors){ // @valid - the Person object
        System.out.println(person);
        if(!errors.hasErrors()){
            personRepository.save(person);
            return "redirect:people";
        }
        return "people"; //returns the /people
    }

    @PostMapping(params = "delete=true")
//    public String deletePeople(@RequestParam(required = false) List<Long> selections){
    public String deletePeople(@RequestParam Optional<List<Long>> selections){
        System.out.println(selections);
        if (selections.isPresent()) {
            personRepository.deleteAllById(selections.get());
        }
        return "redirect:people";
        //redirect will cause model to be detach binding
    }
    @PostMapping(params = "edit=true")
    public String editPerson(@RequestParam Optional<List<Long>> selections, Model model){
        System.out.println(selections);
        if (selections.isPresent()) {
            Optional<Person> person = personRepository.findById(selections.get().get(0));
            model.addAttribute("person", person); //why does this prefill form???
        }
        return "people";
    }
}

// Model - has all the data that needs to be extracted from
// View - extracts from model to display
// Controller - controls the flow of interaction for MVC