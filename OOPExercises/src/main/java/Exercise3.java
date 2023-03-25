public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(getMealsForDays("friday, saturday, wednesday"));
    }


    private static String getMealsForDays(String daysCSV) {
        String[] days = daysCSV.split(","); //puts into an array after splitting from comma
        StringBuilder sb = new StringBuilder();
        for(String day : days){
            sb.append(DaysOfWeekEnum.valueOf(day.strip().toUpperCase()).getMeal());
            sb.append(", ");

        }
        return sb.toString();
    }
}
