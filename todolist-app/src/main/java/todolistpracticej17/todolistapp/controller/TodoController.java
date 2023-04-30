package todolistpracticej17.todolistapp.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import todolistpracticej17.todolistapp.data.TodoRepository;
import todolistpracticej17.todolistapp.model.Task;

import java.util.List;
import java.util.Optional;

@Controller //- informs this serves as the role of controller
@RequestMapping("/TodoList")
public class TodoController {

    private TodoRepository todoRepository;
//
    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @ModelAttribute("tasks")
    public Iterable<Task> getTasks(){
        return todoRepository.findAll();
    }

    @ModelAttribute
    public Task getTask(){
        return new Task();
    }

    @GetMapping  // this will fetch the todoForm.html
    public String showTodoList(){
        return "todoForm"; //view for todoForm - refers back to todoForm.html
    }

    @PostMapping
    public String saveTask(@Valid Task tasks, Errors errors){
        if(!errors.hasErrors()){
            todoRepository.save(tasks);
            return "redirect:TodoList";
        }
        return "todoForm";
    }

    @PostMapping(params = "delete=true")
//    public String deleteTask(@RequestParam(required = false) List<Long> selections){
    public String deletePeople(@RequestParam Optional<List<Long>> selections){
        if(selections.isPresent()){
            System.out.println(selections);
            System.out.println(selections.get().get(0));
            System.out.println("we are here");
            todoRepository.deleteAllById(selections.get());
            return "redirect:TodoList";
        }
        return "todoForm";
    }

}
