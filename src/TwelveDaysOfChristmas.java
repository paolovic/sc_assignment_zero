public class TwelveDaysOfChristmas {
    public static void main(String args[]) {
        String[] text = new String[]{
                "Twelve drummers drumming",
                "Eleven pipers piping",
                "Ten lords a-leaping",
                "Nine ladies dancing",
                "Eight maids a-milking",
                "Seven swans a-swimming",
                "Six geese a-laying",
                "Five golden rings",
                "Four calling birds",
                "Three French hens",
                "Two turtle doves and",
                "A partridge in a pear tree"};
        String[] days = new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
                "elventh", "twelfth"};

        printSong(text, days, 0);
    }

    public static void printSong(String[] text, String days[], int c) {
        if (c == 12) {
            return;
        }
        int x = days.length - 1 - c;
        System.out.println("\nOn the " + days[c] + " day of Christmas\nMy true love sent to me:");
        for (int i = 0; i < c + 1; i++) {
            System.out.println(text[x]);
            x++;
        }
        printSong(text, days, c + 1);
    }
}
