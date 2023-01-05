public class LearnString {
    public static void concatingStrings() {
        String myTest = "abcdefg";
        System.out.println(myTest.toUpperCase());

        String myText2 = "ABCDEFG";
        System.out.println(myText2.toLowerCase());

        System.out.println(myTest.compareTo(myText2));
        System.out.println(myTest.compareToIgnoreCase(myText2));
    }

    public static void main(String[] args) {
        String text1 = "this is text 1";
        String text2 = "this is text 2";
//        System.out.println(text1 + text2); *problem
//        String text2 = " this is text 2"; *solution
//        System.out.println(text1 + " " + text2);*solution
        System.out.println(text1.concat(" " + text2));
        LearnString concatting = new LearnString();
//        System.out.println(concatting);
        LearnString.concatingStrings();
    }



}

