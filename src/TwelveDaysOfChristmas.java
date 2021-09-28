public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        String[] gifts = new String[]{
                "A partridge in a pear tree.",
                "Two turtle doves,",
                "Three French hens,",
                "Four calling birds,",
                "Five golden rings,",
                "Six geese a-laying,",
                "Seven swans a-swimming,",
                "Eight maids a-milking,",
                "Nine ladies dancing,",
                "Ten lords a-leaping,",
                "Eleven pipers piping,",
                "Twelve drummers drumming,"
        };
        String[] days = new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

        System.out.println(createPoem(days, gifts));
    }

    private static String firstLine(int day, String[] days) {
        return "On the " + days[day] + " day of Christmas,\nmy true love sent to me\n";
    }

    private static String remainingLines(int day, String[] gifts) {
        if (day == 0) {
            return "And " + gifts[day];
        } else {
            return gifts[day] + "\n" + remainingLines(day - 1, gifts);
        }
    }

    private static String createPoem(String[] days, String[] gifts) {
        String poem = firstLine(0, days) + gifts[0] + "\n\n";
        for (int day = 1; day < days.length; day++) {
            poem += firstLine(day, days) + remainingLines(day, gifts) + "\n\n";
        }
        return poem;
    }
}
