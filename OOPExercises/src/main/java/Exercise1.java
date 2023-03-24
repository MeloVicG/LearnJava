import java.util.Arrays;

public class Exercise1 {
    private DaysOfWeekEnum dayOfWeek;


    public static void main(String[] args) {
        int index = 0;

        //exercise 1.1
        for(DaysOfWeekEnum day : DaysOfWeekEnum.values()){
            String dayText = day.toString().toLowerCase(); // all lower case
            String firstCapSubstring = dayText.substring(0, 1).toUpperCase(); // first letter caps
            String capitalLetterDay = firstCapSubstring + dayText.substring(1);

            //exercise 1.2
            if(index % 2 == 0){ // if index is even
                System.out.println(capitalLetterDay);
            } else {
                int middleIndex = dayText.length() / 2;
//                System.out.println(dayText.length());
//                System.out.println(middleIndex);
                System.out.println("");

                StringBuilder sb = new StringBuilder(); // builds a string
                sb.append(dayText.substring(0,middleIndex)); // "mon"
                sb.append(dayText.substring(middleIndex, middleIndex+1).toUpperCase());
                sb.append(dayText.substring(middleIndex + 1)); // "ay" rest of index
//                System.out.println("final day: " + sb.toString());
            }
            index++;

            // System.out.println(theDay);
            // System.out.println(firstCapSubstring);
//            System.out.println(capitalLetterDay);
        }

        //exercise 2
        String[] meals = {"pot roast", "chicken", "ramen", "spaghetti", "pork", "pizza", "dumpling"};
        for (int i=0; i < meals.length - 1; i++) {
//            DaysOfWeekEnum[] dayIndex = DaysOfWeekEnum.values();
            System.out.println("I ate " + meals[i] + " on " + DaysOfWeekEnum.values()[i]);
        }
    }
}
