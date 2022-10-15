import java.time.LocalDate;

public class PersonMethodPractice {
    private String middleName = "Chris";
//    public static PersonMethodPractice katie = null;
    public static double PI = 3.14;

    public void sayHello(){
        System.out.println("Hello");
    }

    public void saySomething(String message){
        System.out.println(message);
    }

    public char getMiddleInitial(){
        return middleName.charAt(0);
    }

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public void test(int num1, int num2, String[] words){
        // do something clever with words
    }

    // VarArgs            ellipses - indicates it is varargs
    public void test2(int num1, int num2, String...words){
        System.out.println(words[2]);
    }

    public static void main(String[] args) {
        PersonMethodPractice p1 = new PersonMethodPractice();
        p1.sayHello();
        p1.saySomething("Groovy message here");
        System.out.println(p1.add(2,3));
        System.out.println(PI);

        char middleInitial = p1.getMiddleInitial();
        // same
        System.out.println(p1.getMiddleInitial());
        System.out.println(middleInitial);

        // lesson 14
        String[] words = new String[]{"O","T","TH"};
        // same
        p1.test(3, 2, words);
        // p1.test(new String[] {"one","two","three"});

        p1.test2(3,5, "ONE","TWO","THREE");

    }
}
