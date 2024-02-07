package org.github.mahambach;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public static String getDayType(DaysOfWeek day){
        if(day==SATURDAY||day==SUNDAY) return "Weekend";
        return "Weekday";
/*        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return "Weekday";
            case SATURDAY:
            case SUNDAY:
                return "Weekend";
            default:
                return "what?";
        }*/

    }
}
