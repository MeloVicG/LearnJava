import repository.PeopleRepository;
import model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeopleRepositoryTests {

    private Connection connection;
    private PeopleRepository repo;

    @BeforeEach  //Junit annotation
    void setUp() throws SQLException {
        // establishing a new database connection for each individual @Test
        Connection connection = DriverManager.getConnection("http://127.0.0.1:57667/browser/".replace("~",System.getProperty("user.home")));
        connection.setAutoCommit(false); // auto commits
        repo = new PeopleRepository(connection);
    }

    // @AfterEach kind of like ==> try{ open connection} catch {Exception} {handle exception} finally {cleanup or recover}
    // if we want to ensure connection closes at the end of each test
    // compliments setUp()
    @AfterEach
    void tearDown() throws SQLException { // Exception here for TEST reasons
        if(connection != null){
            connection.close();
        }
    }

    @Test
    public void canSaveOnePerson() throws SQLException {
//        Connection connection = DriverManager.getConnection("http://127.0.0.1:57667/browser/".replace("~",System.getProperty("user.home")));
//        PeopleRepository repo = new PeopleRepository(connection);
        Person john = new Person("John", "Smith", ZonedDateTime.of(1980, 11, 11,11,11,11,11, ZoneId.of("-6")));
        Person savedPerson = repo.save(john);
        assertThat(savedPerson.getId()).isGreaterThan(0); // the dependecy assertJ is not allowing me to import properly a
    }

    @Test
    public void canSaveTwoPerson(){
//        PeopleRepository repo = new PeopleRepository(connection);
        Person john = new Person("John", "Smith", ZonedDateTime.of(1980, 11, 11,11,11,11,11, ZoneId.of("-6")));
        Person bobby = new Person("bobby", "Smith", ZonedDateTime.of(1980, 11, 11,11,11,11,11, ZoneId.of("-6")));
        Person savedPerson1 = repo.save(john);
        Person savedPerson2 = repo.save(bobby);
//        assertThat(savedPerson.getId()).isGreaterThan(0); // the dependecy assertJ is not allowing me to import properly a
        assertThat(savedPerson1.getId()).isGreaterThan().isNotEqualTo(savedPerson2);

    }
}
