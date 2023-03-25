public enum DaysOfWeekEnum {
    SUNDAY("pot roast"),
    MONDAY("spaghetti"),
    TUESDAY("tacos"),
    WEDNESDAY("chicken"),
    THURSDAY("meatloaf"),
    FRIDAY("hamburgers"),
    SATURDAY("pizza");

    private String meal;

    DaysOfWeekEnum(String meal) {
        this.meal = meal;
    }

    public String getMeal() {
        return meal;
    }
}











//    private static String getMealsForDays(String daysCSV){
//        String[] days = daysCSV.split(",");
//        StringBuilder sb = new StringBuilder();
//        for(String day : days){
//            System.out.println(day);
//            sb.append(DaysOfWeekEnum.valueOf(day.strip().toUpperCase()).getMeal());
//            sb.append(", ");
//        }
//
//        return sb.toString();
//    }