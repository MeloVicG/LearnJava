import business.Company;

public class Person {
    //      classes         creating an instance of that class
    private String firstName = "Victor";

    //    primitves
    // when you create object for a primitive there is no variables
    // when we create variables for primitive there is no object
    private int age = 31;
    private long id = 10101; // longer number
    private char midInit = 'I'; //one charcter
    private byte myByte;
        // immutable
    private final double PI = 3.14;
    private final String MY_BIG_CONSTANT = "CONSTANTS are meant to be UPPERCASE";

    // classes give birth to object
    // when we create variables for classes those variables holds reference to
    // an object

    // storring an object in variable = taking the blueprint called company and creating
    static private Company company = new Company();
    static private Company company1 = new Company();
    private NewsAgency agency;

    public static void main(String[] args) {
        System.out.println(company);
        System.out.println(company1);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", midInit=" + midInit +
                ", myByte=" + myByte +
                ", PI=" + PI +
                ", MY_BIG_CONSTANT='" + MY_BIG_CONSTANT + '\'' +
                ", agency=" + agency +
                '}';
    }
}
