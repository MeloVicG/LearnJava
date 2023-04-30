package todolistpracticej17.todolistapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data // lombok - generates getters, setters, and constructor. and equals and hashcode and two string method
@AllArgsConstructor // by default gives us noargsdefault contstructor - need to specify all arguments constructor
@NoArgsConstructor
@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Find something to do!")
    private String task;

//    private LocalDate completed;

//    public String getFormattedDOB(){
//        return DateTimeFormatter.ofPattern("MMMM dd, yyyy").format(completed);
//    }

}
