import java.util.Arrays;

public class Exercise1retry {

    static String[] mealOfTheDay = {"pot roast", "chicken", "ramen", "spaghetti", "pork", "pizza", "dumpling"};

    public static void main(String[] args) {
        int index = 0;
        for (DaysOfWeekEnum daysEnum : DaysOfWeekEnum.values()) {
//            System.out.println(daysEnum);
//            System.out.println("");

            String lowerLetters = daysEnum.toString().toLowerCase();
            String firstCapLetter = daysEnum.toString().substring(0, 1);
            String finaldays = firstCapLetter + lowerLetters.toString().substring(1);
//            System.out.println(firstCapLetter);
            //exercise 1
//            System.out.println(finaldays);

            //exercise 1.2
            if (index % 2 == 0) {
//                System.out.println(finaldays);
                System.out.println("|");
            } else {
                int middleIndex = lowerLetters.length() / 2;
                StringBuilder mainString = new StringBuilder();
                String firstLetters = lowerLetters.substring(0, middleIndex);
                String capLetter = lowerLetters.substring(middleIndex, middleIndex + 1).toUpperCase();
                String lastLetters = lowerLetters.substring(middleIndex + 1);
                mainString.append(firstLetters);
                mainString.append(capLetter);
                mainString.append(lastLetters);
//                System.out.println(mainString);
            }
            index++;
        }
        //exercise 2
        String[] dayOfMeal = new String[7];
        for(int i=0; i < DaysOfWeekEnum.values().length; i++){
            dayOfMeal[i] = ("we ate " + mealOfTheDay[i] + " on " + DaysOfWeekEnum.values()[i]);
            System.out.println(dayOfMeal[i]);
        }

        //exercise 3

    }
}
