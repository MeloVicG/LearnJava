package todolistpracticej17.todolistapp.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import todolistpracticej17.todolistapp.model.Task;



@Repository
public interface TodoRepository extends CrudRepository<Task, Long> {
    // this stores and manages the Task
    // A repository is like a special type of class that allows you to store and retrieve data from a database. In this case, the repository is defined using the CrudRepository interface provided by the Spring Data framework
    // An interface is like a blueprint that defines what methods should be included in a class
    // In this case, the TodoRepository interface extends the CrudRepository interface and specifies that it will be used to manage Task objects.
}
