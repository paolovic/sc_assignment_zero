import java.util.ArrayList;
import java.util.List;

//source: https://gist.github.com/jakewilson801/5552165
public class Days {

    public static void main(String args[]) {

        List<String> days = new ArrayList<String>();

        days.add(new String("A Partridge in a Pear Tree"));
        days.add(new String("2 Turtle Doves"));
        days.add(new String("3 French Hens"));
        days.add(new String("4 Calling Birds"));
        days.add(new String("5 Golden Rings"));
        days.add(new String("6 Geese a Laying"));
        days.add(new String("7 Swans a Swimming"));
        days.add(new String("8 Maids a Milking"));
        days.add(new String("9 Ladies Dancing"));
        days.add(new String("10 Lords a Leaping"));
        days.add(new String("11 Pipers Piping"));
        days.add(new String("12 Drummers Drumming"));

        doWork(days, 0);

    }

    public static void doWork(List<String> days, int i) {

        if(i == 12)
            return;

        sing("On the " + (i +1) + " day of christmas my true love gave to me!");

        for(int x = 0; x < i +1 ; x++)
            sing(days.get(x));

        sing("\n");
        doWork(days, i+1);
    }

    public static void sing(Object o) {
        System.out.println(o.toString());
    }
}