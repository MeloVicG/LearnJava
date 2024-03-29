package repository;

import exception.UnableToSaveException;
import model.Person;

import java.sql.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeopleRepository { // lives in data access layer
    private static final String SAVE_PERSON_SQL = "INSER INTO PEOPLE (FIRST_NAME, LAST_NAME, DOB) VALUES(?, ?, ?)";
    private Connection connection;

    public PeopleRepository(Connection connection) {
        this.connection = connection;
    }

    public Person save(Person person){
//                                   throws SQLException{  ---> not this because java application is written in layers
        try{
            PreparedStatement ps = connection.prepareStatement(SAVE_PERSON_SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setString(3, String.valueOf(Timestamp.valueOf(person.getDob().withZoneSameInstant(ZoneId.of("0")).toLocalDateTime())));
            int recordsAffected = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            //when you iterate must call .next()
            while (rs.next()) {
                long id = rs.getLong(1);
                person.setId(id);
                System.out.println(person);
            }
            System.out.printf("Records affected %d%n", recordsAffected);

        } catch(SQLException e) {
            e.printStackTrace();
            throw new UnableToSaveException("tried to save person but failed: " + person);
        }

        return person;
    }
    public Person findById(Long id){
        Person person = new Person("", "", null);
        person.setId(id);
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT ID, FIRST_NAME, LAST_NAME, DOB FROM PEOPLE WHERE ID=?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();// results we get from query with rows and columns
            while(rs.next()){
                long personId = rs.getLong("ID");
                String first_name = rs.getString("FIRST_NAME");
                String lastName = rs.getString("LAST_NAME");
                ZonedDateTime dob = ZonedDateTime.of(rs.getTimestamp("DOB").toLocalDateTime(), ZoneId.of("+0"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return person;

    }

}
