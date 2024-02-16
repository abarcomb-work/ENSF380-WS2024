/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

// Stand-alone enum 
enum DaysWeek {
    // We can include methods associated with each constant
    MONDAY {
        public String toString() { 
            return "Monday";
        }
    },
    TUESDAY {
        public String toString() {
            return "Tuesday";
        }
    },
    WEDNESDAY {
        public String toString() {
            return "Wednesday";
        }
    },
    THURSDAY {
        public String toString() {
            return "Thursday";
        }
    },
    FRIDAY {
        public String toString() {
            return "Friday";
        }
    },
    SATURDAY {
        public String toString() {
            return "Saturday";
        }
    },
    SUNDAY {
        public String toString() {
            return "Sunday";
        }
    };

    // Define an abstract method which each enum field must implement
    // This is not necessary in order to have methods associated with fields,
    // but ensures that every field must have the method.
    public abstract String toString();

    // We can include a method associated with the entire enum
    public static void introduction() {
        System.out.println("Method introduction called from DaysWeek");
    }

}

public class EnumExample {
    // Enum within a class
    enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
    public static void main(String[] args) {
        // Access a method from the enum
        DaysWeek.introduction();

        // Access a specific enum constant
        DaysWeek day = DaysWeek.SATURDAY;

        // Another way to access this method
        day.introduction();

        // Access position in the enumeration (starts from 0)
        int i = day.ordinal();
        System.out.println(day.toString() + " is at position " + i);

        // Loop through an enum
        for (Months month: Months.values()) {
            printCommentOnMonth(month);
        }
    }

    public static void printCommentOnMonth(Months thisMonth) {     
        // Enums are commonly used in switch statements
        switch(thisMonth) {
            case JANUARY:
                System.out.println(thisMonth + ": Start of the term.");
                break;
            case FEBRUARY:
                System.out.println(thisMonth + ": It is cold in Calgary.");
                break;
            case MARCH: 
                System.out.println(thisMonth + ": Winter semester is almost done.");
                break;
            case APRIL:
                System.out.println(thisMonth + ": Could it be spring?");
                break;
            case MAY:
                System.out.println(thisMonth + ": Could it be spring?");
                break;
            case JUNE:
                System.out.println(thisMonth + ": Could it really be spring now?");
                break;
            case JULY:
                System.out.println(thisMonth + ": Summer! Time for cycling and kayaking.");
                break;
            case AUGUST:
                System.out.println(thisMonth + ": Scenic in the mountains.");
                break;
            case SEPTEMBER:
                System.out.println(thisMonth + ": Getting a bit colder.");
                break;
            case OCTOBER:
                System.out.println(thisMonth + ": Calgary is getting some snow...");
                break;
            case NOVEMBER:
                System.out.println(thisMonth + ": Is it ski season yet?");
                break;
            case DECEMBER:
                System.out.println(thisMonth + ": End of the year and almost time for winter semester.");
                break;
        }

    }

}
